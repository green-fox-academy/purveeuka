import java.util.Scanner;
public class HelloUser {
    public static void main(String[] args) {
        // Modify this program to greet the User instead of the World!
        // The program should ask for the name of the User
        System.out.println("What is your name?");
        Scanner whatsYourName = new Scanner(System.in);
        String username = whatsYourName.nextLine();
        System.out.println("Hello, " + username + "!");
    }
}
