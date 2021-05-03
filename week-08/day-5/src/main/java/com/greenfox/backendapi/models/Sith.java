package com.greenfox.backendapi.models;

public class Sith {
    private String text;
    private String sith_text;

    public Sith() {
    }

    public Sith(String text, String sith_text) {
        this.text = text;
        this.sith_text = sith_text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSith_text() {
        return sith_text;
    }

    public void setSith_text(String sith_text) {
        this.sith_text = sith_text;
    }
}
