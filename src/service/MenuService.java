package service;

import cli.MenuText;
import dao.InterviewQuestionsDao;
import model.Question;
import model.Response;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuService {
    MenuText menuText = new MenuText();
    Question question = new Question();
    Response response = new Response();
    InterviewQuestionsDao interviewQuestionsDao = new InterviewQuestionsDao();
    Scanner scanner = new Scanner(System.in);
    List<List> questionsAndResponsesList = new ArrayList<>();


    // list
    public void showAllQuestions() {
        System.out.println(questionsAndResponsesList);
    }

    // add
    public void addInterview() {
        System.out.println(menuText.TYPE_QUESTION_TEXT);
        String questionFromMenu = scanner.nextLine();
        if (!questionFromMenu.equals("menu")) {
            question.setQuestion(questionFromMenu);
            question.addQuestions(questionFromMenu);
            questionsAndResponsesList.add(question.getQuestions());
            for (int i = 0; i < questionsAndResponsesList.size(); i++) {
                interviewQuestionsDao.setInterviewQuestionsMap(i, questionsAndResponsesList);
            }
        } else return;

        System.out.println(menuText.TYPE_RESPONSES_TEXT);
        String responseFromMenu = scanner.nextLine();
        if (!responseFromMenu.equals("menu")) {
            response.setResponse(responseFromMenu);
            response.addResponses(responseFromMenu);
            for (int i = 0; i < questionsAndResponsesList.size(); i++) {
                interviewQuestionsDao.setInterviewQuestionsMap(i, questionsAndResponsesList);
            }
        } else return;

    }

}
