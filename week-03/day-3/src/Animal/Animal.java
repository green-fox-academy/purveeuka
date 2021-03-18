package Animal;

public class Animal {
    private int hunger = 50;
    private int thirst = 50;

    public int eat() {
       return this.hunger -= 1;
    }
    public int drink() {
        return this.thirst -=1;
    }
    public void play() {
        this.hunger++;
        this.thirst++;
        System.out.println("hunger level: " + hunger);
        System.out.println("Thirst level: " + thirst);

    }
}
/*
    Create an Animal.Animal class
Every animal has a hunger value, which is a whole number
                Every animal has a thirst value, which is a whole number
                When creating a new animal instance these values must be set to the default 50 value
        Every animal can eat() which decreases its hunger by one
        Every animal can drink() which decreases its thirst by one
        Every animal can play() which increases both its hunger and thirst by one
 */