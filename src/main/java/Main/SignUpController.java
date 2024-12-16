package Main;

import javafx.fxml.FXML;
import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import model.User;
import dao.UserDAO;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SignUpController
{
    @FXML
    private PasswordField inputPasssword;

    @FXML
    private TextField inputUsername;

    @FXML
    private Button signUpButton;

    @FXML
    private Text text;
    @FXML
    private Button btnBack;

    @FXML
    public void registerUser()
    {
        int i;
        if(inputUsername.getText() != null && inputPasssword.getText() != null && !inputUsername.getText().isEmpty() && !inputPasssword.getText().isEmpty())
        {
            i = UserDAO.validate(inputUsername.getText());
            if(i == 1)
            {
                text.setText(inputUsername.getText()+ " Username sudah dipakai"); 
            }
            else
            {
                User user = new User(inputUsername.getText(), inputPasssword.getText());
                UserDAO.registerUser(user);
                text.setText(inputUsername.getText()+ " Berhasil didaftarkan, Silakan Log In"); 
            }
        }
        else
        {
            text.setText( "Kolom ini wajib di isi!");
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