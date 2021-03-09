import java.util.HashMap;
public class MapIntroduction {
    public static void main(String[] args) {
        HashMap map = new HashMap<>();
        if (map.isEmpty()) {
            System.out.println("The map is empty.");
        } else {
            System.out.println("The map has an item.");
        }
        System.out.println("---------------------");

        map.put(97, 'a');
        map.put(98, 'b');
        map.put(99, 'c');
        map.put(65, 'A');
        map.put(66, 'B');
        map.put(67, 'C');

        System.out.println(map.keySet());
        System.out.println("---------------------");

        System.out.println(map.values());

        map.put(68, 'D');

        System.out.println(map.size());
        System.out.println("---------------------");

        System.out.println(map.get(99));
        System.out.println("---------------------");

        map.remove(97);

        if (map.containsKey(100)) {
            System.out.println("One value associated with key 100.");
        } else {
            System.out.println("No value associated with key 100");
        }
        System.out.println("-----------------------------");
        map.clear();
        System.out.println(map);


    }

}
