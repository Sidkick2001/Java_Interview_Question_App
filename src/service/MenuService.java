package service;


import dao.InterviewsDao;
import model.Question;
import model.Response;
import java.util.List;
import java.util.stream.IntStream;

public class MenuService {
    Question question = new Question();
    Response response = new Response();
    InterviewsDao InterviewsDao = new InterviewsDao();



    // list
    public void showAllInterviews() {
        List<String> combined = IntStream.range(0, Math.min(question.getQuestions().size(), response.getResponses().size()))
                .mapToObj(i ->"Вопрос: " + question.getQuestions().get(i)
                        + "\n Ответ: " + response.getResponses().get(i))
                .toList();
        System.out.println(combined);
    }


    private void addQuestion(String text) {

        if (!text.equals("menu")) {
            question.addQuestion(text);
        } else return;
    }

    private void addResponse(String text) {

        if (!text.equals("menu")) {
            response.addResponse(text);
        } else return;
    }

    // add


}
