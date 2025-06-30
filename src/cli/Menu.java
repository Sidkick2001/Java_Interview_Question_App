package cli;

import java.util.Scanner;

public class Menu {
    private MenuText menuText = new MenuText();
    private Scanner scanner = new Scanner(System.in);


    public void start() {
        System.out.println(menuText.WELCOME_TEXT);
        int selectedCommand = 0;

        while (selectedCommand != 3) {
            selectedCommand = scanner.nextInt();
            //controller.handleCommand(selectedCommand)
        }
    }
}
