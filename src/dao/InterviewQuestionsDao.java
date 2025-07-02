package dao;


import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class InterviewQuestionsDao {
    private Map<Integer, List> interviewQuestionsMap = new HashMap<>();

    public Map<Integer, List> getInterviewQuestionsMap() {
        return interviewQuestionsMap;
    }

    public void setInterviewQuestionsMap(Integer key,
                                         List<List> listInterviewQuestions) {
        this.interviewQuestionsMap.put(key, listInterviewQuestions);
    }
}
