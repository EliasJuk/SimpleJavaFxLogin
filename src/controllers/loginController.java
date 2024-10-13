package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class loginController {

    @FXML
    private Button btnLogin;

    @FXML
    private PasswordField passwordLogin;

    @FXML
    private TextField userLogin;

    @FXML
    void buttonActionLogin(ActionEvent event) {
        String usuario = userLogin.getText();
        String senha = passwordLogin.getText();

        if(usuario.equals("admin") && (senha.equals("admin"))){
            //FECHA A JANELA DE LOGIN
            Stage stage = (Stage) btnLogin.getScene().getWindow();
            stage.close();

            //ABRE A JANELA PRINCIPAL
            try {                
                Parent root = FXMLLoader.load(loginController.class.getResource("/scenes/scenePrincipal.fxml"));
                Stage stageMain = new Stage();
                Scene scene = new Scene(root);
                stageMain.setScene(scene);
                stageMain.setTitle("Nova Janela");
                stageMain.show();
            } catch (Exception e) {
                System.out.println("ERR:" + e);
            }           

        }else{
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Título do Diálogo");
            alert.setHeaderText("Senha ou Usuario Incorreto");
            alert.setContentText("Usuario: admin\nSenha: admin");
            alert.showAndWait();
        }
    }

}