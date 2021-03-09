import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {
    public static void main(String[] args) {

        HashMap map = new HashMap<>();
        map.put("William A. Lathan", "405-709-1865");
        map.put("John K. Miller", "402-247-8568");
        map.put("Hortensia E. Foster", "606-481-6467");
        map.put("Amanda D. Newland", "319-243-5613");
        map.put("Brooke P. Askew", "307-687-2982");

        ArrayList<String> keys = new ArrayList<>();
        keys.addAll(map.keySet());

        ArrayList<String> values = new ArrayList<>();
        values.addAll(map.values());

        for ( int i = 0; i < values.size(); i++ ){
            if (keys.get(i).equals("John K. Miller")){
                System.out.println("John K. Miller's phone number is " + values.get(i));
            }
        }
        System.out.println("------------------------");

        for (Object name : map.keySet()) {
            if (map.get(name) == "307-687-2982") {
                System.out.println("The number belongs to " + name);
            }
        }
        System.out.println("------------------------");

        if (map.containsKey("Chris E. Myers")){
            System.out.println("Yes, we have Chris E. Myers' number.");
        } else {
            System.out.println("No, we don't have Chris E. Myers' number.");
        }
    }
}



/*
We are going to represent our contacts in a map where the keys are going to be strings
and the values are going to be strings as well.

Create a map with the following key-value pairs.
Name (key)	Phone number (value)
William A. Lathan	405-709-1865
John K. Miller	402-247-8568
Hortensia E. Foster	606-481-6467
Amanda D. Newland	319-243-5613
Brooke P. Askew	307-687-2982

Create an application which solves the following problems.

What is John K. Miller's phone number?
Whose phone number is 307-687-2982?
Do we know Chris E. Myers' phone number?

 */