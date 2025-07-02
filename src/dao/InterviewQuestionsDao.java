package dao;

import model.Question;
import model.Response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class InterviewQuestionsDao {
    private Question question;
    private Response response;
    private Map<Integer, List> interviewQuestionsMap = new HashMap<>();

    public Map<Integer, List> getInterviewQuestionsMap() {
        return interviewQuestionsMap;
    }

    public void setInterviewQuestionsMap(Integer , List<String> interviewQuestionsList) {
        interviewQuestionsMap.put(Integer, interviewQuestionsList);
    }
}
