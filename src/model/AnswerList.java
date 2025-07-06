package model;

import java.util.ArrayList;
import java.util.List;

public class AnswerList {
    private List<String> answerList = new ArrayList<>();

    public List<String> getAnswerList() {
        return answerList;
    }

    public void addAnswerList(String response) {
        answerList.add(response);
    }
}
