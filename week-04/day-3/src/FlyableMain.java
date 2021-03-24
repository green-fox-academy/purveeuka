import Flyable.Helicopter;
import animals.Bird;

public class FlyableMain {
    public static void main(String[] args) {
        Helicopter Chopper = new Helicopter("Chopper", "transport", "Black");
        Chopper.fly();
        Chopper.land();
        Chopper.takeOff();
        System.out.println("---------------------------------");

        Bird parrot = new Bird("Parrot", 2, "male");
        parrot.sound();
        parrot.takeOff();
        parrot.fly();
        parrot.land();
    }
}
