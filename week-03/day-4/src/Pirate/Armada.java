package Pirate;

import java.util.ArrayList;
import java.util.List;

public class Armada {
    List<Ship> armada = new ArrayList<>();
    private int numberOfShips = 1 + (int) (Math.random() * 5);
    private Ship ship;

    public void recruitArmada () {
        for (int i = 0; i < numberOfShips ; i++) {
            ship = new Ship();
            ship.fillShip();
            armada.add(ship);
        }
    }

    public boolean war(Armada otherArmada) {
        System.out.println("Let the war begin!");

        while ((this.armada.size() > 0) && (otherArmada.armada.size() > 0)) {
            if (this.armada.get(0).battle(otherArmada.armada.get(0))) {
                otherArmada.armada.remove(0);
            } else {
                this.armada.remove(0);
            }
            System.out.println("Original armada: " + this.armada.size());
            System.out.println("otherArmada: " + otherArmada.armada.size());
        }

        if (this.armada.size() > otherArmada.armada.size()) {
            return true;
        } else {
        }
        return false;
    }
}