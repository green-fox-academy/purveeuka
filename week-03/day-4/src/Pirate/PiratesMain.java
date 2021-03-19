package Pirate;

import Pirate.Pirate;

public class PiratesMain {

    public static void main(String[] args) {

        Pirate pirate1 = new Pirate("pirate1");
        Pirate pirate2 = new Pirate("pirate2");
        Pirate pirate3 = new Pirate("pirate3");

        pirate1.drinkSomeRum(5);
        pirate2.drinkSomeRum(3);


        pirate2.howsItGoingMate();
        pirate3.howsItGoingMate();
        System.out.println("---------------------------");

        pirate2.die();

        pirate1.brawl(pirate3);
        pirate1.brawl(pirate2);
        System.out.println("---------------------------");

        Ship pirateShip = new Ship();
        Ship secondPirateShip = new Ship();

        pirateShip.representShip();
        secondPirateShip.representShip();

        System.out.println(pirateShip.battle(secondPirateShip));
    }
}

