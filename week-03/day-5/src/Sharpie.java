public class Sharpie {

    String color;
    float width;
    float inkAmount = 100f;

    public Sharpie(String color, float width) {
        this.color = color;
        this.width = width;
    }

    public void use() {
        if (this.width <= 0) {
            System.out.println("The width must be provided!");
        } else if (this.inkAmount < 10) {
            System.out.println("Not enough ink! Please refill or change cartridge.");
        } else {
            this.inkAmount -= 10;
        }
    }
}

/*
    Search back in your own project the Sharpie class you made on the OO workshop
        Create tests that covers all types of input (like in the previous workshop exercise)
 */