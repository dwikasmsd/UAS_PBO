/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Main;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class MainMenuController implements Initializable {

    @FXML
    private Button signUp;
    @FXML
    private Button signIn;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void GoToSignUp(ActionEvent event) {
         try 
         {
            Stage stage = (Stage) signUp.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("/com/mycompany/pauji/SignUp.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.centerOnScreen();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void GoToSignIn(ActionEvent event) {
        try 
         {
            Stage stage = (Stage) signUp.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("/com/mycompany/pauji/SignIn.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.centerOnScreen();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
