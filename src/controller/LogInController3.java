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

public class LogInController3 {

	@FXML
	private Button btnLogIn;
	@FXML
	private Button btncancel;
	@FXML
	private TextField txtusername;
	@FXML
	private PasswordField txtpassword;

	public LogInController3() {

	}

	@FXML
	public void doLogIn() {

		if (txtusername.getText().toString().trim().equalsIgnoreCase("dharma") && txtpassword.getText().toString().trim().equalsIgnoreCase("kshetri")) {
			try {
				Pane root = FXMLLoader.load((getClass().getResource("/view/login3.fxml")));
				Scene scene = new Scene(root);
				scene.getStylesheets().add(getClass().getResource("/application/application.css").toExternalForm());
				Stage stage = new Stage();
				stage.setScene(scene);
				stage.setTitle("Main Form");
				stage.show();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
		}

	}

}
