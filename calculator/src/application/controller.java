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

public class controller{
	@FXML
	private Label result;
	@FXML
	private Label result2;
	@FXML
	private TextField text;
	
	private long number1=0;
	private String operator="";
	private boolean start=true;
	private model model1=new model();
	public void processnumbers(ActionEvent event) {
		if(start) {
			result.setText("");
			start=false;
		}
		String value=((Button)event.getSource()).getText();
		result.setText(result.getText()+value);
		
	}
	public void processoperators(ActionEvent event) {
		String value=((Button)event.getSource()).getText();
		if(!value.equals("=")) {
			if(!operator.isEmpty())
				return;
			operator=value;
			
			number1=Long.parseLong(result.getText());
			result.setText("");
		}
		else {
			if(operator.isEmpty())
				return;
			long number2=Long.parseLong(result.getText());
			float output=model1.calculate(number1,number2,operator);
			result.setText(number1+operator+number2+" ="+String.valueOf(output));
			operator="";
			start=true;
		}
	}
	  @FXML
	    private void onCLClick(ActionEvent event) {
	        result.setText("");
	        number1 = 0;
	        
	        start = false;
	        operator= "";
	    }
	  @FXML
	    private void ondelClick(ActionEvent event) {
	        if(result.getText().length()>0) {
	        	String string=result.getText();
	        	result.setText("");
	        	for(int i=0;i<string.length()-1;i++) {
	        		result.setText(result.getText()+string.charAt(i));
	        	}
	        }
	    }
	  @FXML
	  public void processUnaryOperator(ActionEvent event) {
			
			String value=((Button)event.getSource()).getText();
			if(!operator.isEmpty())
				return;
			
			operator = value;
			number1=Long.parseLong(result.getText());	
			result.setText("");
			
			float output=model1.calculateUnaryNumber(number1,operator);
			result.setText(operator+" "+number1+" = "+String.valueOf(output));
			operator="";
			start=true;

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
	  