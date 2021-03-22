import AirCrafts.Carrier;
import AirCrafts.F16;
import AirCrafts.F35;
import AirCrafts.aircrafts;

public class AircraftsMain {
    public static void main(String[] args) {
        aircrafts F35Alpha = new F35();
        aircrafts F35Delta = new F35();
        aircrafts F35Omega = new F35();

        aircrafts F16Alpha = new F16();
        aircrafts F16Delta = new F16();
        aircrafts F16Omega = new F16();

        Carrier carrierA = new Carrier(2300, 5000);
        Carrier carrierB = new Carrier(2300, 0);

        carrierA.add(F35Alpha);
        carrierA.add(F35Delta);
        carrierA.add(F35Omega);
        carrierA.add(F16Delta);
        carrierA.add(F16Omega);

        carrierB.add(F16Alpha);
        carrierB.add(F16Delta);

        carrierA.fill();
        carrierB.fill();
        carrierA.getStatus();
        System.out.println("------------------------------------");
        carrierB.getStatus();
        System.out.println("------------------------------------");
        carrierA.fight(carrierB);
        carrierA.getStatus();
        System.out.println("------------------------------------");
        carrierB.getStatus();
        F16Delta.refill(8);
        carrierB.getStatus();
        System.out.println("------------------------------------");

        carrierA.fill();
        carrierA.getStatus();
    }
}
