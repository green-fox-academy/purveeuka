public class Reverse {
    public static void main(String... args){
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        StringBuilder reversed= new StringBuilder(toBeReversed);

        String  reverse = "";
        for(int i = toBeReversed.length() - 1; i >= 0; i--)
        {
            reverse =  reverse + toBeReversed.charAt(i);
        }

        System.out.println(reversed.reverse().toString());

    }
}
// Create a method that can reverse a String which is passed as parameter
// Pass the toBeReversed variable to this method to check if it works well
// Solve this task using charAt() function first
// Try other solutions when you are done