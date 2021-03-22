package TheGardenApplication;

public class Tree extends Plant {

    public Tree(String color) {
        super(color);
    }

    public void setWaterLevel(double waterAmount) {
        this.waterLevel = this.waterLevel + (waterAmount* 0.4);
    }

    public void status(){
        if (this.getWaterLevel() < 10) {
            System.out.println("The " + this.getColor() + " tree needs water.");
        } else System.out.println("The " + this.getColor() + " tree doesn't need water.");
    }
}
/*
    The TheGardenApplication.Tree needs water if its current water amount is less then 10
     when watering it the tree can only absorb the 40% of the water
     eg. watering with 10 the tree's amount of water should only increase with 4
 */