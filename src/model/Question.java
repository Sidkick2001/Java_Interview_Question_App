package model;


import java.util.ArrayList;
import java.util.List;

public class Question {
    private String question;
    private List<String> questionList = new ArrayList<>();

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    public List<String> getQuestionList() {
        return questionList;
    }

    public void addQuestionList(String question) {
        questionList.add(question);
    }
}
