package service;

import cli.MenuText;
import model.Question;
import model.Response;
import java.util.Scanner;

public class MenuService {
    MenuText menuText = new MenuText();
    Question question = new Question();
    Response response = new Response();
    Scanner scanner = new Scanner(System.in);

    // list
    public void showAllQuestions() {

    }

    // add
    public void addInterview() {
        System.out.println(menuText.TYPE_QUESTION_TEXT);
        String questionFromMenu = scanner.nextLine();
        if (questionFromMenu != "menu") {
            question.setQuestion(questionFromMenu);
            question.addQuestions(questionFromMenu);
        } else return;

        System.out.println(menuText.TYPE_RESPONSES_TEXT);
        String responseFromMenu = scanner.nextLine();
        if (responseFromMenu != "menu") {
            response.setResponse(responseFromMenu);
            response.addResponses(responseFromMenu);
        } else return;

    }

}
