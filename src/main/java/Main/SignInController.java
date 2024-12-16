/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Main;

import dao.UserDAO;
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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.User;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class SignInController implements Initializable {

    @FXML
    private TextField inputUsername;
    @FXML
    private PasswordField inputPassword;
    @FXML
    private Button signIn;
    @FXML
    private Text text;
    @FXML
    private Button btnBack;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void GoToDifficulty(ActionEvent event) throws IOException {
        int cekUser;
        int cekPass;
        cekUser= UserDAO.validate(inputUsername.getText());
        if(cekUser == 1)
        {
            cekPass = UserDAO.CekPass(inputUsername.getText(),inputPassword.getText());
            if(cekPass == 1)
            {
                User user = new User(inputUsername.getText(), inputPassword.getText());
                user.setUserID(UserDAO.CekID(inputUsername.getText()));
                text.setText(inputUsername.getText()+ " Berhasil Log In");
                
                Stage stage = (Stage) signIn.getScene().getWindow();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/mycompany/pauji/PilihKesulitan.fxml"));
                Parent root = loader.load();
                
                PilihKesulitanController controller = loader.getController();
                controller.setUser(user);
                
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.centerOnScreen();
            }
            else
            {
                text.setText("Password Salah");
            }
        }
        else
        {
            text.setText(inputUsername.getText()+ " Username Tidak Ditemukan"); 
        }
    }

    @FXML
    private void GoToMinMenu(ActionEvent event) {
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
