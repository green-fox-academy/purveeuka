package TheGardenApplication;

public class Plant {
    private String color;
    protected double waterLevel;

    public Plant(String color) {
        this.color = color;
        this.waterLevel = 0;
    }

    public String getColor() {
        return this.color;
    }

    public double getWaterLevel() {
        return this.waterLevel;
    }
}
