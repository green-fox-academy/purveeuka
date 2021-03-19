package Pirate;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
    List<Pirate> pirateShip = new ArrayList();

    public Ship() {
        fillShip();
    }

    public void fillShip() {
        Random random = new Random();
        int drunk = random.nextInt(5);

        Pirate captain = new Pirate(drunk);
        pirateShip.add(captain);

        int crew = random.nextInt(15);
        while (crew>=0) {
            drunk = random.nextInt(5);
            pirateShip.add(new Pirate(drunk));
            crew -= 1;
        }
    }

    public void representShip() {
        int crew = 0;
        for (int i = 0; i < pirateShip.size(); i++) {
            if (pirateShip.get(i).isAlive) {
                crew++;
            }
        }
        System.out.println("The captain drunks: " + pirateShip.get(0).howDrunk);

        if (pirateShip.get(0).isAlive) {
            System.out.println("The captain is alive.");
        } else {
            System.out.println("The captain is dead.");
        }

        System.out.println("The number of alive pirates on this ship: " + crew);
    }

    public boolean battle(Ship enemyShip) {
        if (this.calculateScores() > enemyShip.calculateScores()) {
            return true;
        } else {
            return false;
        }
    }

    public int calculateScores() {
        int alivePirates = 0;
        for (int i = 0; i < pirateShip.size(); i++) {
            if (pirateShip.get(i).isAlive) {
                alivePirates ++;
            }
        }
        return alivePirates;
    }


}