package model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class soal {
    private final StringProperty questionText;
    private final StringProperty optionA;
    private final StringProperty optionB;
    private final StringProperty optionC;
    private final StringProperty optionD;
    private final StringProperty correctAnswer;

    public soal(String questionText, String optionA, String optionB, String optionC, String optionD, String correctAnswer) {
        this.questionText = new SimpleStringProperty(questionText);
        this.optionA = new SimpleStringProperty(optionA);
        this.optionB = new SimpleStringProperty(optionB);
        this.optionC = new SimpleStringProperty(optionC);
        this.optionD = new SimpleStringProperty(optionD);
        this.correctAnswer = new SimpleStringProperty(correctAnswer);
    }

    public StringProperty questionTextProperty() {
        return questionText;
    }

    public StringProperty optionAProperty() {
        return optionA;
    }

    public StringProperty optionBProperty() {
        return optionB;
    }

    public StringProperty optionCProperty() {
        return optionC;
    }

    public StringProperty optionDProperty() {
        return optionD;
    }

    public StringProperty correctAnswerProperty() {
        return correctAnswer;
    }

    public String getQuestionText() {
        return questionText.get();
    }

    public String getOptionA() {
        return optionA.get();
    }

    public String getOptionB() {
        return optionB.get();
    }

    public String getOptionC() {
        return optionC.get();
    }

    public String getOptionD() {
        return optionD.get();
    }

    public String getCorrectAnswer() {
        return correctAnswer.get();
    }
}
