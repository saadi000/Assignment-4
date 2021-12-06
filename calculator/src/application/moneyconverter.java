package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
public class moneyconverter implements Initializable{
	@FXML
	private ComboBox<String> combobox;
	ObservableList<String> list=FXCollections.observableArrayList("PKR","USD","EUR");
	@FXML
	private ComboBox<String> combobox2;
	@FXML
	private TextField textfield;
	@FXML
	private TextField textfield2;
	ObservableList<String> list2=FXCollections.observableArrayList("PKR","USD","EUR");
	@FXML
	private Label label;
	@FXML
	private Label label2;
	private boolean start=true;
	private long number1=0;
	private String operator="";
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		combobox.setItems(list);
		combobox2.setItems(list2);
	}
	public void processnumbers(ActionEvent event) {
		if(start) {
			label2.setText("");
			start=false;
		}
		String value=((Button)event.getSource()).getText();
		label2.setText(label2.getText()+value);
		
	}
	@FXML
	 private void onCLClick(ActionEvent event) {
	        label2.setText("");
	        number1 = 0;
	        
	        start = false;
	        operator= "";
	    }
	  @FXML
	    private void ondelClick(ActionEvent event) {
	        if(label2.getText().length()>0) {
	        	String string=label2.getText();
	        	label2.setText("");
	        	for(int i=0;i<string.length()-1;i++) {
	        		label2.setText(label2.getText()+string.charAt(i));
	        	}
	        }
	    }
	public void convert(ActionEvent event) {
		try {
		String a=combobox.getValue();
		String b=combobox2.getValue();
		Float val=Float.parseFloat(label2.getText());
		if(a.equals("PKR")&&b.equals("PKR")) {
			label.setText(val.toString());
		}
		else if(a.equals("USD")&&b.equals("USD")) {
			label.setText(val.toString());
		}
		else if(a.equals("EUR")&&b.equals("EUR")) {
			label.setText(val.toString());
		}
		else if(a.equals("PKR")&&b.equals("USD")) {
			 val=(float) (val/176.97);
			 label.setText(val.toString());
		}
		else if(a.equals("PKR")&&b.equals("EUR")) {
			 val=(float) (val/199.65);
			 label.setText(val.toString());
		}
		else if(a.equals("USD")&&b.equals("PKR")) {
			 val=(float) (val*176.97);
			 label.setText(val.toString());
		}
		else if(a.equals("USD")&&b.equals("EUR")) {
			 val=(float) (val*0.89);
			 label.setText(val.toString());
		}
		else if(a.equals("EUR")&&b.equals("PKR")) {
			 val=(float) (val*199.65);
			 label.setText(val.toString());
		}
		else if(a.equals("EUR")&&b.equals("USD")) {
			 val=(float) (val/0.89);
			 label.setText(val.toString());
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	private Stage stage;
	private Scene scene;
	private Parent root;
	public void switchtomenu(ActionEvent event) throws IOException{
		Parent root=FXMLLoader.load(getClass().getResource("/application/menu.fxml"));
		stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
		}
}
