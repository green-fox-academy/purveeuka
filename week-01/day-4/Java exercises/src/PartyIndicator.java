import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        System.out.println("Please enter the numbers of girls and boys!");
        Scanner numbers = new Scanner(System.in);
        int girls = numbers.nextInt();
        int boys = numbers.nextInt();
        if (girls == boys && girls + boys >= 20) {
            System.out.println("The party is excellent!");
        } else if (boys + girls >= 20  && girls != boys ) {
            System.out.println("Quite a cool party!");
        }  else if ((girls + boys) < 20 && girls > 0){
            System.out.println("Average party!");
        } else {
            System.out.println("Sausage party");
        }
    }
}
// Write a program that asks for two numbers
// The first number represents the number of girls that comes to a party, the
// second represents the number of boys
//
// If the the number of girls and boys are equal and 20 or more people are coming to the party
// it should print: The party is excellent!
//
// If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
// it should print: Quite a cool party!
//
// If there are less people coming than 20
// it should print: Average party...
//
// If no girls are coming, regardless the count of the people
// it should print: Sausage party