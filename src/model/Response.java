package model;


import java.util.ArrayList;
import java.util.List;

public class Response {
    private List<String> responses = new ArrayList<>();

    public List<String> getResponses() {
        return responses;
    }

    public void addResponse(String response) {
        responses.add(response);
    }
}
