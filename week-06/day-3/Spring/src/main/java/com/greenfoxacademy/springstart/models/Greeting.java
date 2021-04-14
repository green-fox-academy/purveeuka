package com.greenfoxacademy.springstart.models;

public class Greeting {
    private final long greetCount;
    private String content;

    public Greeting(long greetCount, String content) {
        this.greetCount = greetCount;
        this.content = content;
    }

    public long getGreetCount() {
        return greetCount;
    }

    public String getContent() {
        return content;
    }
}
