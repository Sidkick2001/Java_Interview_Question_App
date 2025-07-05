package service;

import dao.InterviewsDao;
import model.Question;
import model.Answer;
import java.util.List;
import java.util.stream.IntStream;

public class MenuService {
    Question question = new Question();
    Answer answer = new Answer();
    InterviewsDao InterviewsDao = new InterviewsDao();

    // list
    public void showAllInterviews() {

    }

    public boolean addQuestion(String text) {

        if (!text.equals("menu")) {
            question.addQuestionList(text);
            return true;
        } else return false;
    }

    public void addAnswer(String text) {

        if (!text.equals("menu")) {
            answer.addAnswerList(text);
        }
        else return;
    }






}
