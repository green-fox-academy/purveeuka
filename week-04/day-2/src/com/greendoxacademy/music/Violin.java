package com.greendoxacademy.music;

public class Violin extends StringedInstrument{

    public Violin() {
        name = "Violin";
        numberOfStrings = 4;
    }

    public void Violin(String name, int numberOfStrings) {
        this.name = name;
        this.numberOfStrings = numberOfStrings;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    @Override
    protected void sound() {
        System.out.println("Screech");
    }

    @Override
    public void play() {
        System.out.print(this.getName() + ", a " + getNumberOfStrings() + " -stringed instrument that goes ");
        sound();
    }
}
