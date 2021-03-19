public class Animal {
     int hunger = 50;
     int thirst = 50;
     public Animal() {
     }

    public Animal(int hunger, int thirst) {
        this.hunger = hunger;
        this.thirst = thirst;
    }

    public int eat() {
        return this.hunger -= 1;
    }

    public int drink() {
         if(thirst == 0)
             System.out.println("Pet is not thirsty");
        return this.thirst -=1;
    }

    public void play() {
         if(hunger > 50 && thirst > 50)
             System.out.println("Feed your pet!");
        this.hunger++;
        this.thirst++;
        System.out.println("hunger level: " + hunger);
        System.out.println("Thirst level: " + thirst);
    }
}

/*
    Search back in your own project directory the Animal class you made on the OO workshop
        Create tests for multiple test cases.
 */