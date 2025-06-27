
public class cli {
    private static final String WELCOME_TEXT = "WELCOME TO JAVA INTERVIEW APP!\n";
    private static final String MAIN_TEXT = """
        Доступные команды:
        
        1. list - показать все вопросы
        2. add - добавить вопрос
        3. exit - выйти
        
        Введите команду:
        """;

    public void printWelcomeMenu() {
        System.out.println(WELCOME_TEXT);
        System.out.println(MAIN_TEXT);
    }

    public void printMenu() {
        System.out.println(MAIN_TEXT);
    }


}
