import java.util.Scanner;

public class SubStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write a sentence!");
        String input = scanner.nextLine();
        System.out.println("Now please write a word!");
        String second = scanner.nextLine();
        if (input.length() >= second.length()) {
            System.out.println("The index of the first letter is  " +  subStr(input, second) +
                    " in the first sentence. " );
        } else {
            System.out.println("The index of the first letter is  -1 in the first sentence. ");
        }

    }

    public static int subStr(String sentence, String second) {
        int StartIndex = 0;

        while (!second.equals(sentence.substring(StartIndex, (StartIndex + second.length())))) {
            if (StartIndex <= (sentence.length() - second.length()) - 1) {
                StartIndex = StartIndex + 1;
            } else {
                break;
            }
        }
        if ((((sentence.length() - second.length())) > StartIndex) || second.equals(sentence.substring(StartIndex))) {
            return StartIndex + 1;
        } else {
            return - 1;
        }
    }
}



