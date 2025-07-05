package controller;

import cli.MenuText;
import model.Answer;
import model.Question;
import service.MenuService;
import java.util.Scanner;


public class MenuController {
    Scanner scanner = new Scanner(System.in);
    MenuService menuService = new MenuService();
    MenuText menuText = new MenuText();

    public void handleCommand(String command) {
        if (command.equals("list")) {
            menuService.showAllInterviews();
        }
        if (command.equals("add")) {
            System.out.println(menuText.ADD_TEXT);

            System.out.println(menuText.TYPE_QUESTION_TEXT);
            String TypedQuestion = scanner.nextLine();
            boolean isAddedQuestion = menuService.addQuestion(TypedQuestion);
            if (!isAddedQuestion) return;

            System.out.println(menuText.TYPE_ANSWER_TEXT);
            String TypedAnswer = scanner.nextLine();
            menuService.addAnswer(TypedAnswer);
        }
    }
}

