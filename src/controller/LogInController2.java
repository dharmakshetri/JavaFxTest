package controller;

import application.Main;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class LogInController2 {

	@FXML
	private Button btnNextWindow;

	public LogInController2() {

	}


		@FXML
		public void  nextWindow () {
			try {
				Pane root = FXMLLoader.load((getClass().getResource("/view/login3.fxml")));
				Scene scene = new Scene(root);
				scene.getStylesheets().add(getClass().getResource("/application/application.css").toExternalForm());
				Stage stage = new Stage();
				stage.setScene(scene);
				stage.setTitle(" Last Window");
				stage.show();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}	

}
