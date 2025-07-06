package dao;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InterviewsDao {
    private int id = 0;
    private Map<Integer, List<String>> interviewsList = new HashMap<>();

    public Map<Integer, List<String>> getInterviewsList() {
        return interviewsList;
    }

    public void addInterviewsList(List<String> list) {
        interviewsList.put(id, list);
    }

    
}
