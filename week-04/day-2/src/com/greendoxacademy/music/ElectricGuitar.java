package com.greendoxacademy.music;

public class ElectricGuitar  extends StringedInstrument{

    public ElectricGuitar() {
        name = "Electric Guitar";
        numberOfStrings = 6;
    }

    public ElectricGuitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
        name = "Electric Guitar";
    }

    public int getNumberOfStrings(){
        return numberOfStrings;
    }

    public String getName() {
        return name;
    }


    @Override
    protected void sound() {
        System.out.println("Twang");
    }

    @Override
    public void play() {
        System.out.print(this.getName() + ", a " + getNumberOfStrings() + "-stringed instrument that goes ");
        sound();
    }
}
