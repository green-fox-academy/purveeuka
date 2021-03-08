import java.util.Arrays;

public class Unique {
    public static void main (String[]args){
        int[] num = {1, 11, 34, 11, 52, 61, 1, 34};
        Arrays.sort(num);
        findUnique(num);


    }

    public static void findUnique(int[] a) {
        for (int num1 = 0; num1 < a.length; num1++) {
            boolean isUnique = false;
            for (int num2 = 0; num2 < num1; num2++) {
                if (a[num1] == a[num2]) {
                    isUnique = true;
                    break;
                }

            }
            if (!isUnique) {
                System.out.print(a[num1] + " ");
            }

        }


    }
}
