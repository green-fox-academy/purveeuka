package animals;

import Flyable.Flyable;

public class Bird extends Animal implements Flyable {

    public Bird(String name, int age, String gender){
        super(name, age, gender);
    }

    @Override
    public String breed() {
        return "laying eggs.";
    }

    @Override
    public void sound() {
        System.out.println("Parrot imitating your sound....");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public String getGender() {
        return super.getGender();
    }

    @Override
    public void land() {
        System.out.println("Parrot has landed on your shoulder.");
    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying through the woods.");

    }

    @Override
    public void takeOff() {
        System.out.println("Parrot is about to takeoff from your shoulder.");
    }
}
