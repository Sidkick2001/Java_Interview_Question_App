package model;


import java.util.ArrayList;
import java.util.List;

public class Question {
    private List<String> questions = new ArrayList<>();

    public List<String> getQuestions() {
        return questions;
    }

    public void addQuestion(String question) {
        questions.add(question);
    }
}
