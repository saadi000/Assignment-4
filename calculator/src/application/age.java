package application;

import java.io.IOException;
import java.time.LocalDate;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class age {
@FXML
private DatePicker sdate;
@FXML
private DatePicker sdate2;
@FXML
private Label label;
public void getage(ActionEvent event) {
	LocalDate mydate=sdate.getValue();
	String a=mydate.toString();
	LocalDate mydate2=sdate2.getValue();
	String b=mydate2.toString();
	String c=a.substring(0,4);
	String d=b.substring(0,4);
	int age1=Integer.parseInt(c);
	int age2=Integer.parseInt(d);
	int res=age2-age1;
	label.setText("Yout age is: "+res);
	
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