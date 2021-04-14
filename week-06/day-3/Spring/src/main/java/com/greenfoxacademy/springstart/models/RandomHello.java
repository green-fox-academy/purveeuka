package com.greenfoxacademy.springstart.models;

public class RandomHello {
    public static int randomInt(int from, int to) {
        return (int) (Math.random() * ((to - from) + 1) + from);
    }

    public static int randomInt(int to) {
        return randomInt(0, to);
    }

    public static int diceRoll() {
        return randomInt(1, 6);
    }
}
