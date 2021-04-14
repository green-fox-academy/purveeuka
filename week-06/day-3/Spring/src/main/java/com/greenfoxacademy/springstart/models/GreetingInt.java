package com.greenfoxacademy.springstart.models;

public class GreetingInt {
    private static final String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
    private int fontSize;
    private String color;

    public GreetingInt(int fontSize, String color) {
        this.fontSize = fontSize;
        this.color = color;
    }

    public String getHello() {
        return hellos[RandomHello.randomInt(hellos.length-1)];
    }

    public int getFontSize() {
        return fontSize;
    }

    public String getColor() {
        return color;
    }

}
