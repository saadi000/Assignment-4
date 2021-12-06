package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Menu {
	private Stage stage;
	private Scene scene;
	private Parent root;
	public void switchtoBMI(ActionEvent event) throws IOException{
	Parent root=FXMLLoader.load(getClass().getResource("/application/bmi.fxml"));
	stage=(Stage)((Node)event.getSource()).getScene().getWindow();
	scene=new Scene(root);
	stage.setScene(scene);
	stage.show();
	}
	public void switchtoage(ActionEvent event) throws IOException{
		Parent root=FXMLLoader.load(getClass().getResource("/application/age.fxml"));
		stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
		}
	public void switchtoinvestment(ActionEvent event) throws IOException{
		Parent root=FXMLLoader.load(getClass().getResource("/application/investment.fxml"));
		stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
		}
	public void switchtocalculator(ActionEvent event) throws IOException{
		Parent root=FXMLLoader.load(getClass().getResource("/application/main.fxml"));
		stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
		}
	public void switchtoarea(ActionEvent event) throws IOException{
		Parent root=FXMLLoader.load(getClass().getResource("/application/Area.fxml"));
		stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
		}
	public void switchtodiscount(ActionEvent event) throws IOException{
		Parent root=FXMLLoader.load(getClass().getResource("/application/discount.fxml"));
		stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
		}
	public void switchtomoney(ActionEvent event) throws IOException{
		Parent root=FXMLLoader.load(getClass().getResource("/application/moneyconverter.fxml"));
		stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
		}
	public void switchtomass(ActionEvent event) throws IOException{
		Parent root=FXMLLoader.load(getClass().getResource("/application/mass.fxml"));
		stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
		}
	public void switchtospeed(ActionEvent event) throws IOException{
		Parent root=FXMLLoader.load(getClass().getResource("/application/speed.fxml"));
		stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
		}
	public void switchtotemperature(ActionEvent event) throws IOException{
		Parent root=FXMLLoader.load(getClass().getResource("/application/temperature.fxml"));
		stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
		}
	public void switchtovolume(ActionEvent event) throws IOException{
		Parent root=FXMLLoader.load(getClass().getResource("/application/Volume.fxml"));
		stage=(Stage)((Node)event.getSource()).getScene().getWindow();
		scene=new Scene(root);
		stage.setScene(scene);
		stage.show();
		}
}
