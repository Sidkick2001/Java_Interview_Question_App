package cli;

import controller.MenuController;
import java.util.Scanner;

public class Menu {
    MenuText menuText = new MenuText();
    Scanner scanner = new Scanner(System.in);
    MenuController menuController = new MenuController();

    public void start() {
        System.out.println(menuText.WELCOME_TEXT);
        String selectedCommand = "";

        while (!selectedCommand.equals("exit")) {
            System.out.println(menuText.MAIN_TEXT);
            selectedCommand = scanner.nextLine();
            menuController.handleCommand(selectedCommand);
        }
    }
}
