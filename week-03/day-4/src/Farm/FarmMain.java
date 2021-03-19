package Farm;

public class FarmMain {
    public static void main(String[] args) {
        Farm myFarm = new Farm(5);

        for (int a = 0; a < 5; a++){
            myFarm.add();
        }

        myFarm.animals.get(2).hunger = 5;
        myFarm.sell();


        System.out.println(myFarm.capacity);
        System.out.println("-----------------------");
        System.out.println(myFarm.animals.size());
        System.out.println("-----------------------");

        myFarm.breed();
        System.out.println(myFarm.capacity);
        System.out.println("-----------------------");
        myFarm.breed();
        System.out.println(myFarm.capacity);
    }
}
