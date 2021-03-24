import animals.*;

public class Zoo {
    public static void main(String[] args) {

        Reptile reptile = new Reptile("Crocodile", 5, "male");
        Mammal mammal = new Mammal("Koala", 1, "female");
        Bird bird = new Bird("Parrot", 6, "Male");

        System.out.println("How do you breed?");
        System.out.println("A " + reptile.getName() + " is breeding by " + reptile.breed());
        System.out.println("This is " + reptile.getAge() + " a year old " + reptile.getGender() + " Crocodile.");
        reptile.sound();
        System.out.println("------------------------------------------------------");

        System.out.println("A " + mammal.getName() + " is breeding by " + mammal.breed());
        System.out.println("This is " + mammal.getAge() + " a year old " + mammal.getGender() + " Koala.");
        mammal.sound();
        System.out.println("------------------------------------------------------");

        System.out.println("A " + bird.getName() + " is breeding by " + bird.breed());
        System.out.println("This is " + bird.getAge() + " a year old " + bird.getGender() + " Parrot.");
        bird.sound();
        bird.takeOff();
    }
}
