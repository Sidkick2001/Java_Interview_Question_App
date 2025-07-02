package model;


import java.util.ArrayList;
import java.util.List;

public class Question {
    private String question;
    private List<String> questions = new ArrayList<>();

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getQuestions() {
        return questions;
    }

    public void addQuestions(String question) {
        questions.add(question);
    }
}
