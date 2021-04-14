package com.greenfoxacademy.springstart.models;

public class FizzBuzzWoof {
    private final long number;
    private String keyWord;
    private int fontSize;

    public FizzBuzzWoof(long number) {
        this.number = number;
        this.keyWord = "";
        this.fontSize = 0;
        setFontSize();
    }

    private void setFontSize() {
        if (number % 3 == 0) {
            keyWord += "Fizz";
            fontSize = 24;
        }
        if (number % 5 == 0) {
            keyWord = "Buzz";
            fontSize = 48;
        }
        if (number % 7 == 0 ) {
            keyWord = "Woof";
            fontSize = 72;
        }
        if (keyWord.length() == 0) {
            keyWord = String.valueOf(number);
            fontSize = 12;
        }
    }

    public String getResult() {
        return this.keyWord;
    }

    public int getFontSize() {
        return fontSize;
    }
}