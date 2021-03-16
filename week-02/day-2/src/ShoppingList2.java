import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ShoppingList2 {
    public static void main(String[] args) {
        HashMap<String, Double> shopList = new HashMap<>();
        shopList.put("Milk", 1.07);
        shopList.put("Rice", 1.59);
        shopList.put("Eggs", 3.14);
        shopList.put("Cheese", 12.60);
        shopList.put("Chicken Breast", 9.40);
        shopList.put("Apples", 2.31);
        shopList.put("Tomato", 2.58);
        shopList.put("Potato", 1.75);
        shopList.put("Onion", 1.10);

        HashMap<String, Double> bob = new HashMap<>();
        bob.put("Milk", 3.0);
        bob.put("Rice", 2.0);
        bob.put("Eggs", 2.0);
        bob.put("Cheese", 1.0);
        bob.put("Chicken Breast", 4.0);
        bob.put("Apples", 1.0);
        bob.put("Tomato", 2.0);
        bob.put("Potato", 1.0);

        HashMap<String, Double> alice = new HashMap<>();
        alice.put("Rice", 1.0);
        alice.put("Eggs", 5.0);
        alice.put("Chicken Breast", 2.0);
        alice.put("Apples", 1.0);
        alice.put("Tomato", 10.0);

        double bobBill = 0;
        Iterator bobPay = bob.entrySet().iterator();

        while (bobPay.hasNext()) {

            Map.Entry mapElement = (Map.Entry) bobPay.next();

            String ll = (String) (mapElement.getKey());
            bobBill += ((double) (mapElement.getValue())) * shopList.get(ll);
        }

        double aliceBill = 0;
        Iterator alicePay = alice.entrySet().iterator();

        while (alicePay.hasNext()) {

            Map.Entry mapElement = (Map.Entry) alicePay.next();

            String ll = (String) (mapElement.getKey());
            aliceBill += ((double) (mapElement.getValue())) * shopList.get(ll);
        }

        System.out.println("Bob has to pay: " + bobBill);
        System.out.println("Alice has to pay: " + aliceBill);


        if ((alice.containsValue("Rice")) && (bob.containsValue("Rice"))) {
            if ((alice.get("Rice")) < (bob.get("Rice"))) {
                System.out.println("Bob buys more rice");
            } else if ((alice.get("Rice")) == bob.get("Rice")) {
                System.out.println("They buy the same amount of rice");
            } else {
                System.out.println("Alice buys more");
            }
        } else if (!((alice.containsValue("Rice")))) {

            System.out.println("Bob buys more Rice");
        } else {
            System.out.println("Alice buys more rice");
        }

        if ((alice.containsValue("Potato")) && (bob.containsValue("Potato"))) {
            if ((alice.get("Potato")) < (bob.get("Potato"))) {
                System.out.println("Bob buys more Potato");
            } else if ((alice.get("Potato")) == bob.get("Potato")) {
                System.out.println("they buy the same amount of potato");
            } else {
                System.out.println("Alice buys more Potato");
            }
        } else if (!((alice.containsValue("Potato")))) {

            System.out.println("Bob buys more potato");
        } else {
            System.out.println("Alice buys more potato");
        }


        if (alice.size() < bob.size()) {
            System.out.println("Bob buys more different products");
        } else if (alice.size() > bob.size()) {
            System.out.println("Alice buys more different products");
        } else {
            System.out.println("they buy equal  kinds if products");
        }

        double bobPro = 0;
        Iterator BobProduct = bob.entrySet().iterator();

        while (BobProduct.hasNext()) {

            Map.Entry mapElement = (Map.Entry) BobProduct.next();

            String list = (String) (mapElement.getKey());
            bobPro += ((double) (mapElement.getValue()));
        }

        double alicePro = 0;
        Iterator AliceProduct = alice.entrySet().iterator();

        while (AliceProduct.hasNext()) {

            Map.Entry mapElement = (Map.Entry) AliceProduct.next();

            alicePro += ((double) (mapElement.getValue()));
        }

        if (alicePro < bobPro) {
            System.out.println("Bob buys more products");
        } else if (alicePro > bobPro) {
            System.out.println("Alice buys more products");
        } else {
            System.out.println("they buy equal amounts of stuff");
        }
    }
}
/*
Create an application which solves the following problems.
  How much does Bob pay?
  How much does Alice pay?
  Who buys more Rice?
  Who buys more Potato?
  Who buys more different products?
  Who buys more products? (piece)
 */