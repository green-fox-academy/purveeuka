package Pirate;

public class BattleApp {
    public static void main(String[] args) {
        Ship blackPearl = new Ship();
        blackPearl.fillShip();
        Ship whitePearl = new Ship();
        whitePearl.fillShip();

        blackPearl.battle(whitePearl);

        blackPearl.representShip();
        System.out.println("--------------------");
        whitePearl.representShip();
        System.out.println("---------------------");
    }
}
