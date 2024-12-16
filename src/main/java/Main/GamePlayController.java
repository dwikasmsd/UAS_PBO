/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Main;

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
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;
import model.game_session;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class GamePlayController implements Initializable {

    @FXML
    private MenuButton diff_easy;
    @FXML
    private MenuItem lvl1;
    @FXML
    private MenuItem lvl2;
    @FXML
    private MenuItem lvl3;
    @FXML
    private MenuItem lvl4;
    @FXML
    private MenuItem lvl5;
    @FXML
    private Button btnBack;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
    @FXML
    private void lvl1Easy(ActionEvent event) {
        try 
         {
            Stage stage = (Stage) btnBack.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("/com/mycompany/pauji/GmaePlaynew.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.centerOnScreen();
            
        } catch (IOException e) {
          e.printStackTrace();
        }
    }

    @FXML
    private void goToPilihKesulitan(ActionEvent event) {
    }
    
}
