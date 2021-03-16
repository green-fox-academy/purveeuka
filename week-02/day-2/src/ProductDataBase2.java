import java.util.*;


public class ProductDataBase2 {
    public static void main(String[] args) {
        HashMap products = new HashMap<>();

        products.put("Eggs", 200);
        products.put("Milk", 200);
        products.put("Fish", 400);
        products.put("Apples", 150);
        products.put("Bread", 50);
        products.put("Chicken", 550);

        Iterator cheap = products.entrySet().iterator();
        System.out.println("The products under 201: ");
        while (cheap.hasNext()) {
            Map.Entry mapElement = (Map.Entry) cheap.next();
            if (((int) (mapElement.getValue()) < 201)) {
                System.out.println(mapElement.getKey());
            }
        }

        Iterator expensive = products.entrySet().iterator();
        System.out.println("The products more than 150: ");

        while (expensive.hasNext()) {
            Map.Entry mapElement = (Map.Entry) expensive.next();
            if (((int) (mapElement.getValue()) > 150)) {
                System.out.print(mapElement.getKey() + " - ");
                System.out.println(mapElement.getValue());
            }
        }
    }
}
