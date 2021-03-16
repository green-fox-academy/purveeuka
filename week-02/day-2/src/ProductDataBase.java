import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
public class ProductDataBase {
    public static void main(String[] args) {
        HashMap products = new HashMap<>();

        products.put("Eggs", 200);
        products.put("Milk", 200);
        products.put("Fish", 400);
        products.put("Apples", 150);
        products.put("Bread", 50);
        products.put("Chicken", 550);

        System.out.println(" Fish is " + products.get("Fish"));

        ArrayList<String> productKey = new ArrayList<>();
        productKey.addAll(products.keySet());
        ArrayList<Integer> productValue = new ArrayList<>();
        productValue.addAll(products.values());

        for (int expensiveProduct = 0; expensiveProduct < productKey.size(); expensiveProduct++) {
            if (productValue.get(expensiveProduct) >= 550) {
                System.out.println("The most expensive product is " + productKey.get(expensiveProduct));
            }
        }

        int sum = 0;

        for (int i = 0; i < productValue.size(); i++) {
            sum = sum + productValue.get(i);
        }
        System.out.println("The average price is : " + (sum /= productValue.size()));

        Collections.sort(productValue);
        int below300 = 1;
        for (int cheapP = 0; productValue.get(cheapP) <= 300; cheapP++) {
            below300 = cheapP;
        }
        System.out.println("There are " + below300 + " product/s below 300.");

        if (products.containsValue(125)) {
            System.out.println("We product for 125.");
        } else {
            System.out.println("There is no product for 125!");
        }
        System.out.println("The cheapest product is " + productKey.get(5));

    }
}

/*
We are going to represent our products in a map where the keys are strings representing the product's name
and the values are numbers representing the product's price.

Create a map with the following key-value pairs.

Product name (key)	Price (value)
Eggs	200
Milk	200
Fish	400
Apples	150
Bread	50
Chicken	550
Create an application which solves the following problems.
How much is the fish?
What is the most expensive product?
What is the average price?
How many products' price is below 300?
Is there anything we can buy for exactly 125?
What is the cheapest product?
 */