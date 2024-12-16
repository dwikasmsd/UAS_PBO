/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 *//*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.io.IOException;

/**
 *
 * @author USER
 */
public class HardController {

    public static int correct;
    public static int wrong;
    @FXML
    public Label question;

    @FXML
    private final TextField jawaban;

    static int counter = 0;


    public HardController(TextField jawaban) {
        this.jawaban = jawaban;
    }

    @FXML
    private void initialize() {
        loadquestions();
    }

    private void loadquestions() {

        if (counter == 0) { //Question 1
            question.setText("1. Tumbuhan Sakura berasal dari negara mana?");
            jawaban.textProperty();
        }
        if (counter == 1) { //Question 2
            question.setText("2. Tumbuhan apa yang bisa hidup di padang pasir?");
            jawaban.textProperty();

        }
        if (counter == 2) { //Question 3
            question.setText("3. Tumbuhan apa yang dikenal bisa menangkap serangga?");
            jawaban.textProperty();
        }
        if (counter == 3) { //Question 4
            question.setText("4. Apa nama bagian tumbuhan yang menyerap air dari tanah?");
            jawaban.textProperty();
        }
        if (counter == 4) {//Question 5
            question.setText("5. Tumbuhan apa yang memiliki daun sangat besar?");
            jawaban.textProperty();
        }
        if (counter == 5) { //Question 6
            question.setText("6. Hewan apa yang bisa mengubah warna tubuhnya sesuai tempatnya?");
            jawaban.textProperty();
        }
        if (counter == 6) { //Question 7
            question.setText("7. Hewan kangguru berasal dari?");
            jawaban.textProperty();
        }
        if (counter == 7) { //Question 8
            question.setText("8. Burung apa yang tidak bisa terbang tapi bisa lari sangat cepat?");
            jawaban.textProperty();
        }
        if (counter == 8) { //Question 9
            question.setText("9. Hewan apa yang hidup di darat dan di air?");
            jawaban.textProperty();
        }
        if (counter == 9) { //Question 10
            question.setText("10. Hewan Komodo berasal dari?");
            jawaban.textProperty();
        }

    }


    @FXML
    public void subclicked(ActionEvent event) {
        checkjawaban(jawaban.getText());
        if (checkjawaban(jawaban.getText().toString())) {
            correct = correct + 1;
        } else {
            wrong = wrong + 1;
        }
        if (counter == 9) {
            try {
                System.out.println(correct);
                Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisstage.close();
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("Result.fxml"));
                Scene quizscene = new Scene(quiz.load());
                quizscene.setFill(Color.TRANSPARENT);
                Stage quizstage = new Stage();
                quizstage.setScene(quizscene);
                quizstage.initStyle(StageStyle.TRANSPARENT);
                quizstage.show();
            } catch(IOException e) {
                e.printStackTrace();
            }
        } else {
            counter++;
            loadquestions();
        }

    }

    boolean checkjawaban(String jawaban) {

        if (counter == 0) {
            if (jawaban.equals("Jepang")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 1) {
            if (jawaban.equals("Kaktus")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 2) {
            if (jawaban.equals("Kantong Semar")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 3) {
            if (jawaban.equals("Akar")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 4) {
            if (jawaban.equals("Pisang")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 5) {
            if (jawaban.equals("Bunglon")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 6) {
            if (jawaban.equals("Australia")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 7) {
            if (jawaban.equals("Burung Unta")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 8) {
            if (jawaban.equals("Katak")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 9) {
            if (jawaban.equals("Indonesia")) {
                return true;
            } else {
                return false;
            }
        }
        return false;


    }



}