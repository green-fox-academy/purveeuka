import TheGardenApplication.Flower;
import TheGardenApplication.Garden;
import TheGardenApplication.Plant;
import TheGardenApplication.Tree;

import java.util.ArrayList;
import java.util.List;

public class GardenMain {
    public static void main(String[] args) {
        Flower yellow = new Flower("yellow");
        Flower blue = new Flower("blue");
        Tree purple = new Tree("purple");
        Tree orange = new Tree("orange");

        yellow.status();
        blue.status();
        purple.status();
        orange.status();

        Garden wateringThePlants = new Garden();

        List<Plant> miniGarden = new ArrayList<>();
        miniGarden.add(yellow);
        miniGarden.add(blue);
        miniGarden.add(purple);
        miniGarden.add(orange);
        System.out.println("-----------------------------");


        wateringThePlants.watering(miniGarden,40);

        for (Plant plant:miniGarden) {
            if (plant instanceof Flower) {
                ((Flower)plant).status();
            } else ((Tree)plant).status();
        }
        System.out.println();
        System.out.println("-----------------------------");

        wateringThePlants.watering(miniGarden,70);

        for (Plant plant:miniGarden) {
            if (plant instanceof Tree){
                ((Tree)plant).status();
            }else ((Flower)plant).status();
        }
        System.out.println();
    }
}
