import java.util.Scanner;
public class AnimalsAndLegs {
    public static void main(String[] args) {
        System.out.println("How many chickens do you have?");
        Scanner animalNumber = new Scanner(System.in);
        int chickenLegs = animalNumber.nextInt() * 2;
        System.out.println("How many pigs do you have?");
        int pigLegs = animalNumber.nextInt() * 4;
        int sumLegs = chickenLegs + pigLegs;


        System.out.println("Sum of the legs of animals " + sumLegs);
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

    }
}
