package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class loginController {

    @FXML
    private Button btnLogin;

    @FXML
    private PasswordField passwordLogin;

    @FXML
    private TextField userLogin;

    @FXML
    void buttonActionLogin(ActionEvent event) {
        System.out.println("Hello World!!!");
    }

}