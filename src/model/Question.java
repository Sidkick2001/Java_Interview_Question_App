package model;

public abstract class Question {
    private String question;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public abstract void addQuestion();

}
