import java.util.ArrayList;
import java.util.HashMap;

public class MapIntroduction2 {
    public static void main(String[] args) {
        HashMap map = new HashMap<>();
        map.put("978-1-60309-452-8", "A Letter to Jo");
        map.put("978-1-60309-459-7", "Lupus");
        map.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        map.put("978-1-60309-461-0", "The Lab");

        ArrayList<String> keysets = new ArrayList<>();
        keysets.addAll(map.keySet());
        ArrayList<String> valuesets = new ArrayList<>();
        valuesets.addAll(map.values());

        for (int items = 0; items < map.size(); items++) {
            System.out.println(valuesets.get(items) + " (ISBN: " + keysets.get(items) + ")");
        }

        map.remove(978-1-60309-444-3);
        map.values().remove("The Lab");

        map.put(978-1-60309-450-4, "They Called Us Enemy");
        map.put(978-1-60309-453-5, "Why Did We Trust Him?");

        if (map.containsKey(478-0-61159-424-8)) {
            System.out.println("One value associated with key: 478-0-61159-424-8.");
        } else {
            System.out.println("No value associated with key: 478-0-61159-424-8");
        }
        System.out.println("------------------------");
        System.out.println(map.get(978-1-60309-453-5));

    }

}
