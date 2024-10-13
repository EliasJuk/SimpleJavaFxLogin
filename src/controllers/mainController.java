package controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class mainController {

    @FXML
    private Button btnUpdateWindow;

    @FXML
    private Button btnNewWindow;

    @FXML
    void newWindowAction(ActionEvent event) {
        try {
            // Carregar o novo FXML
            FXMLLoader loader = new FXMLLoader(mainController.class.getResource("/scenes/sceneNova.fxml"));
            Pane newSceneRoot = loader.load(); //CERTIFIQUE QUAL É O OBJETO PRINCIPAL A SER ABERTO (Pane - AnchorPane - Scene)
    
            // Criar uma nova cena
            Scene newScene = new Scene(newSceneRoot);
    
            // Criar um novo estágio (janela)
            Stage newStage = new Stage();
            newStage.setScene(newScene);
            newStage.setTitle("Nova Janela");
            newStage.show();
        } catch (IOException e) {
            //e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText("Falha ao abrir a nova cena");
            alert.setContentText("Ocorreu um erro ao carregar a cena de colaboradores.");
            alert.showAndWait();
        }
    }

    
    //ATUALIZA A JANELA ATUAL
    @FXML
    void UpdateWindowAction(ActionEvent event) {
        try {
            // Carregar o novo FXML
            FXMLLoader loader = new FXMLLoader(mainController.class.getResource("/scenes/sceneSecundaria.fxml"));
            Pane newSceneRoot = loader.load();

            // Criar uma nova cena
            Scene newScene = new Scene(newSceneRoot);

            // Obter o estágio atual a partir do botão que acionou o evento
            Stage currentStage = (Stage) btnUpdateWindow.getScene().getWindow();
            
            // Configurar a nova cena no estágio atual
            currentStage.setScene(newScene);
            currentStage.setTitle("Nova Cena"); // Defina o título da nova janela, se quiser
            currentStage.show();

        } catch (IOException e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Erro");
            alert.setHeaderText("Falha ao abrir a nova cena");
            alert.setContentText("Ocorreu um erro ao carregar a cena de colaboradores.");
            alert.showAndWait();
        }
    }
}
