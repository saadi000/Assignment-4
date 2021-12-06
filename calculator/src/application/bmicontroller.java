package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class bmicontroller {
	@FXML
	private Label label;
	@FXML
	private Label label2;
	@FXML 
	private TextField textfield;
	@FXML
	private TextField textfield2;
	@FXML
	private Button button;
	public void calculate_bmi(ActionEvent event) {
		float weight=Integer.parseInt(textfield.getText());
		float height=Integer.parseInt(textfield2.getText());
		float bmi=(weight/height/height)*10000;
		label.setText(Float.toString(bmi));
		if(bmi<18.5 && bmi>0) {
			label2.setText("Underweight");
		}
		else if(bmi>=18.5 && bmi<=24.9) {
			label2.setText("Healthy");
		}
		else if(bmi>=25 && bmi<=29.9) {
			label2.setText("Overweight");
		}
		else if(bmi>=30) {
			label2.setText("Obese");
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
