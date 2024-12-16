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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import model.User;
import model.game_session;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class PilihKesulitanController implements Initializable {

    @FXML
    private Button easy;
    @FXML
    private Button medium;
    @FXML
    private Button Hard;
    @FXML
    private TableView<game_session> easyTableView;
    @FXML
    private TableColumn<game_session, ?> easyColomNum;
    @FXML
    private TableColumn<game_session, ?> easyColomName;
    @FXML
    private TableColumn<User, ?> easyColomScore;
    @FXML
    private TableView<User> mediumTableView;
    @FXML
    private TableColumn<User, ?> mediumColomNum;
    @FXML
    private TableColumn<User, ?> mediumColomName;
    @FXML
    private TableColumn<User, ?> mediumColomScore;
    @FXML
    private TableView<?> hardTableView;
    @FXML
    private TableColumn<?, ?> hardColomNum;
    @FXML
    private TableColumn<?, ?> hardColomName;
    @FXML
    private TableColumn<?, ?> hardColomScore;
    @FXML
    private Button btnBack;
    
    private User user; // Variabel untuk menyimpan data User


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void setUser(User user) {
        this.user = user;
    }

    @FXML
    private void PlayEasy(ActionEvent event) {
        try 
         {
            game_session sesi = new game_session (1, 0,  user.getUserID() , 1, 1);
            Stage stage = (Stage) btnBack.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("/com/mycompany/pauji/GamePlaynew.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
            stage.centerOnScreen();
            
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void PlayMedium(ActionEvent event) {
        try 
         {
            game_session sesi = new game_session (1, 0,  user.getUserID() , 1, 1);
            Stage stage = (Stage) btnBack.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("/com/mycompany/pauji/GamePlay.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.centerOnScreen();
            
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    @FXML
    private void PlayHard(ActionEvent event) {
        try 
         {
            game_session sesi = new game_session (1, 0,  user.getUserID() , 1, 1);
            Stage stage = (Stage) btnBack.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("/com/mycompany/pauji/GamePlayHard.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.centerOnScreen();
            
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void GoToMainMenu(ActionEvent event) {
        try 
         {
            Stage stage = (Stage) btnBack.getScene().getWindow();
            Parent root = FXMLLoader.load(getClass().getResource("/com/mycompany/pauji/MainMenu.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.centerOnScreen();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
