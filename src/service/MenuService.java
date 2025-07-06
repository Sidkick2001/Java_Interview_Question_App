package service;

import dao.InterviewsDao;
import model.AnswerList;
import model.QuestionList;

public class MenuService {
    QuestionList questionList = new QuestionList();
    AnswerList answerList = new AnswerList();
    InterviewsDao InterviewsDao = new InterviewsDao();

    // list
    public void showAllInterviews() {

    }

    // add
    public void addQuestion(String text) {
        questionList.addQuestionList(text);
    }

    // add
    public void addAnswer(String text) {
        answerList.addAnswerList(text);
    }






}
