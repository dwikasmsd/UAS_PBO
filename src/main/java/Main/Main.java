package Main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */

import java.io.File;
import java.io.IOException;
import java.net.URL;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author USER
 */
public class Main extends Application {
    
    @Override
    public void start(Stage stage) throws IOException {
        //URL url = new File (".../pauji/src/main/resources/com.mycompany.pauji/Tampilan.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(getClass().getResource("/com/mycompany/pauji/MainMenu.fxml"));
        Scene scene = new Scene(root);
        
        stage.centerOnScreen();
        stage.setScene(scene);
        stage.setTitle("jendela");
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
