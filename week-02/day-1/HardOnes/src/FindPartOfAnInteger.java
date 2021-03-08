import java.util.ArrayList;

public class FindPartOfAnInteger {
    public static void main(String[] args) {
        System.out.println(subInt(11, new int[] {1, 11, 34, 52, 61}));
        System.out.println(subInt(23, new int[] {1, 11, 34, 52, 61}));
    }

    public static ArrayList <Integer> subInt(int num, int[] numArray) {
        ArrayList<Integer> result = new ArrayList<>();
        String numArrayString = String.valueOf(num);
        for (int i = 0; i < numArray.length; i++) {
            if (String.valueOf(numArray[i]).contains(numArrayString)) {
                result.add(i);
            }
        }
        return result;


    }
}
