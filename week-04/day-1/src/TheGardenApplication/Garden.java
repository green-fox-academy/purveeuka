package TheGardenApplication;

import java.util.ArrayList;
import java.util.List;

public class Garden {
    public void watering(List<Plant> garden, double waterAmount){

        List<Plant> needWater = new ArrayList<>();

        for (Plant plant:garden) {
            if (((plant instanceof Flower) && (plant.getWaterLevel() < 5))
                || (plant instanceof Tree) && (plant.getWaterLevel() < 10)) {
                needWater.add(plant);
            }
        }

        waterAmount = waterAmount / needWater.size();

        for (Plant plant:needWater) {
            if (plant instanceof Flower) {
                ((Flower)plant).setWaterLevel(waterAmount);
            } else ((Tree)plant).setWaterLevel(waterAmount);
        }
    }
}
/*
    The TheGardenApplication.Garden
    is able to hold unlimited amount of flowers or trees
    when watering it should only water those what needs water with equally divided amount amongst them
    eg. watering with 40 and 4 of them need water then each gets watered with 10
 */