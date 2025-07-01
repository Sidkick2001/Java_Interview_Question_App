package controller;

import service.MenuService;

public class MenuController {
    MenuService menuService = new MenuService();

    public void handleCommand(String command) {
        if (command.equals("list")) {
            //toDo
        }
        if (command.equals("add")) {
            menuService.addInterview();
        }
    }
}
