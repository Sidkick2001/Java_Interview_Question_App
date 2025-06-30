package model;

public abstract class Response {
    private String response;

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public abstract void addResponse();
}
