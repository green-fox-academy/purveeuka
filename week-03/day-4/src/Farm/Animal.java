package Farm;

public class Animal {
    int hunger = 50;
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