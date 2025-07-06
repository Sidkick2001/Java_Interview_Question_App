package model;

import java.util.ArrayList;
import java.util.List;

public class QuestionList {
    private List<String> questionList = new ArrayList<>();

    public void addQuestionList(String question) {
        questionList.add(question);
    }

    public List<String> getQuestionList() {
        return questionList;
    }
}
