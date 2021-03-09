import java.util.ArrayList;

public class ListIntroduction2 {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        listA.add("Apple");
        listA.add("Avocado");
        listA.add("Durian");
        listA.add("Lychee");

        ArrayList<String> listB = new ArrayList<>(listA );
        System.out.println(listA.contains("Lychee"));
        System.out.println("------------------------");

        listB.remove("Durian");
        System.out.println(listB);
        System.out.println("------------------------");

        listA.add(4,"Kiwifruit");
        System.out.println(listA);
        System.out.println("------------------------");

        if (listA.size() > listB.size()){
            System.out.println("List 'A' has more items.");
        } else if (listA.size() < listB.size()){
            System.out.println("List 'B' has more items.");
        } else {
            System.out.println("The lists have the same amount of items");
        }
        System.out.println("------------------------");

        System.out.println(listA.indexOf("Avocado"));
        System.out.println("------------------------");
        System.out.println(listB.indexOf("Durian"));
        System.out.println("------------------------");

        ArrayList<String> temporaryList = new ArrayList<>();
        temporaryList.add("Passion fruit");
        temporaryList.add("Pomelo");
        listB.addAll(temporaryList);
        System.out.println(listB);
        System.out.println("------------------------");
        System.out.println(listA.get(2));
    }
}
