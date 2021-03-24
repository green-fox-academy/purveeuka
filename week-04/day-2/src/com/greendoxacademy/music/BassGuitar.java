package com.greendoxacademy.music;

public class BassGuitar  extends  StringedInstrument{

    public BassGuitar() {
        name = "Bass Guitar";
        numberOfStrings = 4;

    }

    public BassGuitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
        name = "Bass Guitar";
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String getName() {
        return name;
    }

    @Override
    protected void sound() {
        System.out.println("Duum-duum-duum");
    }

    @Override
    public void play() {
        System.out.print(this.getName() + ", a " + this.getNumberOfStrings() + " -stringed instrument that goes ");
        sound();
    }
}
