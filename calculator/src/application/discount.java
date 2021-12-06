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

public class discount {
	private long number1=0;
	private String operator="";
	private boolean start=true;
	@FXML
	TextField textfield;
	@FXML
	TextField textfield2;
	@FXML
	Label label;
	@FXML
	Label label2;
	@FXML 
	Button button;
	public void calculatediscount(ActionEvent event) {
		float original=Integer.parseInt(textfield.getText());
		float discount=Integer.parseInt(textfield2.getText());
		float total=original-(discount/100)*original;
		label.setText(Float.toString(total));
		label2.setText("You save "+(original-total));
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


