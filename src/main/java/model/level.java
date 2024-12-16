package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class level {
    private final int levelNumber;
    private final String description;
    private final ObservableList<soal> soal;

    public level(int levelNumber, String description) {
        this.levelNumber = levelNumber;
        this.description = description;
        this.soal = FXCollections.observableArrayList();
    }

    public int getLevelNumber() {
        return levelNumber;
    }

    public String getDescription() {
        return description;
    }

    public ObservableList<soal> getQuestions() {
        return soal;
    }

    public void addQuestion(soal question) {
        this.soal.add(question);
    }
}
