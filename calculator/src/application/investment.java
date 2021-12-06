package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class investment {
@FXML
private Label label;
@FXML
private TextField textfield;
@FXML
private TextField textfield2;
@FXML
private TextField textfield3;
public void cal_in(ActionEvent event) {
	float a=Float.parseFloat(textfield.getText());
	float b=Float.parseFloat(textfield2.getText());
	b=b/100;
	float c=Float.parseFloat(textfield3.getText());
	float d=a*b*c+a;
	label.setText("Total investment after time period = "+d);
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
