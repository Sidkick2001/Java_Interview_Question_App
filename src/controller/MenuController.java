package controller;

import cli.MenuText;
import service.MenuService;
import java.util.Scanner;

import static java.awt.SystemColor.menuText;

public class MenuController {
    Scanner scanner = new Scanner(System.in);
    MenuService menuService = new MenuService();
    MenuText menuText = new MenuText();

    public void handleCommand(String command) {
        if (command.equals("list")) {
            menuService.showAllInterviews();
        }
        if (command.equals("add")) {
            System.out.println(menuText.TYPE_QUESTION_TEXT);
            String questionFromMenu = scanner.nextLine();
            menuService.addInterview(questionFromMenu);

            System.out.println(menuText.TYPE_RESPONSES_TEXT);
            String responseFromMenu = scanner.nextLine();
            menuService.addResponse(responseFromMenu);
        }
    }
}
