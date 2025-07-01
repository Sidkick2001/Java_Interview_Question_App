package controller;

import service.MenuService;

public class MenuController {
    MenuService menuService = new MenuService();

    public void handleCommand(String command) {
        if (command == "list") {
            //toDo
        }
        if (command == "add") {
            menuService.addInterview();
        }
    }
}
