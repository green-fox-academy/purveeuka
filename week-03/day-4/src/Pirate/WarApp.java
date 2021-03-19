package Pirate;

public class WarApp {
    public static void main(String[] args) {
        Armada otherArmada = new Armada();
        Armada originalArmada = new Armada();

        originalArmada.recruitArmada();
        otherArmada.recruitArmada();
        otherArmada.war(originalArmada);
    }
}
