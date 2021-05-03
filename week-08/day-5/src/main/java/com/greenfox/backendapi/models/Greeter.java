package com.greenfox.backendapi.models;

public class Greeter {
    private String welcome_message;

    public Greeter(String greeting) {
        this.welcome_message = greeting;
    }

    public String getWelcome_message() {
        return welcome_message;
    }

    public void setWelcome_message(String welcome_message) {
        this.welcome_message = welcome_message;
    }
}



