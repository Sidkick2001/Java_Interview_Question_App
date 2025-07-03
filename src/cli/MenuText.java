package cli;

public class MenuText {
    public final String WELCOME_TEXT = "WELCOME TO JAVA INTERVIEW APP!";
    public final String MAIN_TEXT = """
        Доступные команды:
        
        1. list - показать все вопросы
        2. add - добавить вопрос
        3. exit - выйти
        
        Введите команду:""";

    public final String ADD_TEXT = """
                    === Добавление интервью вопроса ===
                            введите текст вопроса
                        (для возрата введите "menu"):    
            """;

    public final String TYPE_QUESTION_TEXT = "Введите вопрос:";

    public final String TYPE_RESPONSES_TEXT = "Введите ответ:";
}
