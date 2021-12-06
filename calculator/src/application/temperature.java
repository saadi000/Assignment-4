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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class temperature implements Initializable{
	@FXML
	private ComboBox<String> combobox;
	ObservableList<String> list=FXCollections.observableArrayList("Degree Celcius","fahrenheit","Kelvin");
	@FXML
	private ComboBox<String> combobox2;
	ObservableList<String> list2=FXCollections.observableArrayList("Degree Celcius","fahrenheit","Kelvin");
	@FXML
	TextField textfield;
	@FXML
	Label label;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		combobox.setItems(list);
		combobox2.setItems(list2);
	}
	public void convert(ActionEvent event) {
		String a=combobox.getValue();
		String b=combobox2.getValue();
		Float val=Float.parseFloat(textfield.getText());
		if(a.equals("Degree Celcius")&&b.equals("Degree Celcius")) {
			label.setText(val.toString());
		}
		else if(a.equals("fahrenheit")&&b.equals("fahrenheit")) {
			label.setText(val.toString());
		}
		else if(a.equals("Kelvin")&&b.equals("Kelvin")) {
			label.setText(val.toString());
		
		}
		else if(a.equals("Degree Celcius")&&b.equals("fehrenheit")) {
			 val=(float) ((val*1.8)+32);
			 label.setText(val.toString());
		}
		else if(a.equals("Degree Celcius")&&b.equals("Kelvin")) {
			 val=(float) (val+273.15);
			 label.setText(val.toString());
		}
		else if(a.equals("fehrenheit")&&b.equals("Degree Celcius")) {
			 val=(float) (((val-32)*5)/9);
			 label.setText(val.toString());
		}
		else if(a.equals("fehrenheit")&&b.equals("Kelvin")) {
			val=(float) (((val-32)*5)/9+273.15);
			 label.setText(val.toString());
		}
		else if(a.equals("Kelvin")&&b.equals("Degree Celcius")) {
			 val=(float) (val-273.15);
			 label.setText(val.toString());
		}
		else if(a.equals("Kelvin")&&b.equals("fehrenheit")) {
			 val=(float) (((val-273.15)*9)/5);
			 label.setText(val.toString());
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
