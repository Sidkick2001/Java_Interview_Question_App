package model;


import java.util.ArrayList;
import java.util.List;

public class Answer {
    private String answer;
    private List<String> answerList = new ArrayList<>();

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    public List<String> getAnswerList() {
        return answerList;
    }

    public void addAnswerList(String response) {
        answerList.add(response);
    }

    public void setAnswerList(List<String> answerList) {
        this.answerList = answerList;
    }
}
