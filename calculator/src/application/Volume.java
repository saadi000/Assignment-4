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

public class Volume {
	@FXML
	private TextField textfield;
	@FXML
	private TextField textfield2;
	@FXML
	private TextField textfield3;
	@FXML
	private Label label;
	@FXML
	private Label label2;
	public void cal_vol(ActionEvent event) {
		float a=Float.parseFloat(textfield.getText());
		float b=Float.parseFloat(textfield2.getText());
		float c=Float.parseFloat(textfield2.getText());
		float volume=a*b*c;
		label.setText("volume= "+volume);
	}
	public void cal_peri(ActionEvent event) {
		float a=Float.parseFloat(textfield.getText());
		float b=Float.parseFloat(textfield2.getText());
		
		float peri=(2*a)+(2*b);
		label2.setText("perimeter= "+peri);
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
