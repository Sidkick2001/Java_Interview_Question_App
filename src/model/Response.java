package model;


import java.util.ArrayList;
import java.util.List;

public class Response {
    private String response;
    private List<String> responses = new ArrayList<>();

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public List<String> getResponses() {
        return responses;
    }

    public void addResponses(String response) {
        responses.add(response);
    }
}
