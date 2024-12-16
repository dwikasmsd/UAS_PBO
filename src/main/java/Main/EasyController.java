/*
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
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import javafx.scene.Parent;

/**
 *
 * @author USER
 */
public class EasyController {

    public static int correct;
    public static int wrong;
    @FXML
    public Label question;

    @FXML
    public Button opt1, opt2, opt3, opt4;

    static int counter = 0;

    @FXML
    private void initialize() {
        loadQuestions();
    }

    private void loadQuestions() {

        if (counter == 0) { //Question 1
            question.setText("1. Tumbuhan Sakura berasal dari negara mana?");
            opt1.setText("Tiongkok");
            opt2.setText("Jepang");
            opt3.setText("Korea Selatan");
            opt4.setText("Thailand");
        }
        if (counter == 1) { //Question 2
            question.setText("2. Tumbuhan apa yang bisa hidup di padang pasir?");
            opt1.setText("Kaktus");
            opt2.setText("Padi");
            opt3.setText("Mangga");
            opt4.setText("Semangka");
        }
        if (counter == 2) { //Question 3
            question.setText("3. Tumbuhan apa yang dikenal bisa menangkap serangga?");
            opt1.setText("Mawar");
            opt2.setText("Kantong Semar");
            opt3.setText("Melati");
            opt4.setText("Kaktus");
        }
        if (counter == 3) { //Question 4
            question.setText("4. Apa nama bagian tumbuhan yang menyerap air dari tanah?");
            opt1.setText("Daun");
            opt2.setText("Batang");
            opt3.setText("Akar");
            opt4.setText("Bunga");
        }
        if (counter == 4) {//Question 5
            question.setText("5. Tumbuhan apa yang memiliki daun sangat besar?");
            opt1.setText("Pisang");
            opt2.setText("Mangga");
            opt3.setText("Rambutan");
            opt4.setText("Durian");
        }
        if (counter == 5) { //Question 6
            question.setText("6. Hewan apa yang bisa mengubah warna tubuhnya sesuai tempatnya?");
            opt1.setText("Kucing");
            opt2.setText("Bunglon");
            opt3.setText("Anjing");
            opt4.setText("Hamster");
        }
        if (counter == 6) { //Question 7
            question.setText("7. Hewan kangguru berasal dari?");
            opt1.setText("Australia");
            opt2.setText("Vietnam");
            opt3.setText("Inggris");
            opt4.setText("Bekasi");
        }
        if (counter == 7) { //Question 8
            question.setText("8. Burung apa yang tidak bisa terbang tapi bisa lari sangat cepat?");
            opt1.setText("Burung Elang");
            opt2.setText("Burung Merpati");
            opt3.setText("Ayam");
            opt4.setText("Burung Unta");
        }
        if (counter == 8) { //Question 9
            question.setText("9. Hewan apa yang hidup di darat dan di air?");
            opt1.setText("Kucing");
            opt2.setText("Katak");
            opt3.setText("Ayam");
            opt4.setText("Ikan");
        }
        if (counter == 9) { //Question 10
            question.setText("10. Hewan Komodo berasal dari?");
            opt1.setText("Indonesia");
            opt2.setText("Argentina");
            opt3.setText("Spanyol");
            opt4.setText("Uruguay");
        }
//        if (counter == 10) { //Question 10
//            Stage stage = (Stage) getScene().getWindow();
//            Parent root = FXMLLoader.load(getClass().getResource("/com/mycompany/pauji/GamePlayHard.fxml"));
//            Scene scene = new Scene(root);
//            stage.setScene(scene);
//            stage.centerOnScreen();
//        }

    }


    @FXML
    public void opt1clicked(ActionEvent event) {
        checkAnswer(opt1.getText().toString());
        if (checkAnswer(opt1.getText().toString())) {
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
            loadQuestions();
        }

    }

    boolean checkAnswer(String answer) {

        if (counter == 0) {
            if (answer.equals("Jepang")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 1) {
            if (answer.equals("Kaktus")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 2) {
            if (answer.equals("Kantong Semar")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 3) {
            if (answer.equals("Akar")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 4) {
            if (answer.equals("Pisang")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 5) {
            if (answer.equals("Bunglon")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 6) {
            if (answer.equals("Australia")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 7) {
            if (answer.equals("Burung Unta")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 8) {
            if (answer.equals("Katak")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 9) {
            if (answer.equals("Indonesia")) {
                return true;
            } else {
                return false;
            }
        }
        return false;


    }

    @FXML
    public void opt2clicked(ActionEvent event) {
        checkAnswer(opt2.getText().toString());
        if (checkAnswer(opt2.getText().toString())) {
            correct = correct + 1;
        } else {
            wrong = wrong + 1;
        }
        if (counter == 9) {
            try {
                System.out.println("Correct: " + correct + ", Wrong: " + wrong);

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
            loadQuestions();
        }
    }

    @FXML
    public void opt3clicked(ActionEvent event) {
        checkAnswer(opt3.getText().toString());
        if (checkAnswer(opt3.getText().toString())) {
            correct = correct + 1;
        } else {
            wrong = wrong + 1;
        }
        if (counter == 9) {
            try {
                System.out.println("Correct: " + correct + ", Wrong: " + wrong);

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
            loadQuestions();
        }
    }

    @FXML
    public void opt4clicked(ActionEvent event) {
        checkAnswer(opt4.getText().toString());
        if (checkAnswer(opt4.getText().toString())) {
            correct = correct + 1;
        } else {
            wrong = wrong + 1;
        }
        if (counter == 9) {
            try {
                System.out.println("Correct: " + correct + ", Wrong: " + wrong);
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
            loadQuestions();
        }
    }

}