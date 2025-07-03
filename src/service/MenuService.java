package service;


import dao.InterviewQuestionsDao;
import model.Question;
import model.Response;
import java.util.ArrayList;
import java.util.List;

public class MenuService {
    Question question = new Question();
    Response response = new Response();
    InterviewQuestionsDao interviewQuestionsDao = new InterviewQuestionsDao();

    List<List> questionsAndResponsesList = new ArrayList<>();


    // list
    public void showAllInterviews() {
        for (int i = 0; i < questionsAndResponsesList.size(); i++) {
            interviewQuestionsDao.setInterviewQuestionsMap(i, questionsAndResponsesList);
        }
        System.out.println(interviewQuestionsDao.getInterviewQuestionsMap());
    }

    // add
    public void addInterview(String questionFromMenu) {

        if (!questionFromMenu.equals("menu")) {
            question.addQuestion(questionFromMenu);
            questionsAndResponsesList.add(question.getQuestions());
        } else return;
    }

    public void addResponse(String responseFromMenu) {

        if (!responseFromMenu.equals("menu")) {
            response.addResponse(responseFromMenu);
            questionsAndResponsesList.add(response.getResponses());
        } else return;
    }

}
