package Flyable;

public class Helicopter extends Vehicle implements Flyable{

    public Helicopter(){
    }

    public Helicopter(String name, String type, String color){
        this.name = name;
        this.type = type;
        this.color = color;
    }

    @Override
    public void fly() {
        System.out.println("This is " + this.getName() + " we're running out of fuel! ");
    }

    @Override
    public void land() {
        System.out.println(this.getName() + " " + this.getColor() + " is requesting a permission to touchdown ");
    }

    @Override
    public void takeOff() {
        System.out.println(this.getName() + " for " + this.getType() + " is requesting a permission to takeoff.");

    }
}
