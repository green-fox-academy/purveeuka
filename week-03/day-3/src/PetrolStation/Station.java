package PetrolStation;

public class Station {
    int gasAmount = 1000000;
    public Station(){
    }
    public void refill(Car car) {
        this.gasAmount -= car.capacity;
        car.gasAmount += car.capacity;
        System.out.println("Gas amount left: " + gasAmount);
        System.out.println("Tank level " + car.gasAmount + " %");
    }
}
