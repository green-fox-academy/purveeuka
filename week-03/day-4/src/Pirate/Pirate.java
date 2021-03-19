package Pirate;

import java.util.Random;

public class Pirate {
    private String name;
    private boolean isPassedOut;
    int howDrunk = 0;
    boolean isAlive = true;

    public Pirate() {
    }
    public Pirate(String name){
        this.name = name;
    }

    public Pirate(int howDrunk) {
        this.howDrunk = howDrunk;
    }

    public void drinkSomeRum() {
        this.howDrunk += 1;
    }

    public void drinkSomeRum(int n) {
        this.howDrunk += n;
    }

    public void howsItGoingMate() {
        if (this.howDrunk <= 4) {
            System.out.println("Pour me anudder!");
        } else {
            System.out.println("Arghh, I'ma Pirate.Pirate. How d'ya d'ink its goin?");
            this.howDrunk = 0;
        }
    }

    public void die() {
        this.isAlive = false;
    }

    public void brawl(Pirate pirate) {
        if (!this.isAlive) {
            System.out.println("He's dead.");
            return;
        }

        if (pirate.isAlive) {
            int chance = randomChance();

            switch (chance) {
                case 0:
                    this.die();
                    System.out.println(pirate.name + " won!");
                    break;
                case 1:
                    pirate.die();
                    System.out.println(this.name + " won!");
                    break;
                case 2:
                    this.isPassedOut = true;
                    pirate.isPassedOut = true;
                    System.out.println("Both passed out!");
                    break;
                default:

            }
        }
    }
    private int randomChance() {
        return new Random().nextInt(3);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
/*
    Create a Pirate.Pirate class. You can add other fields and methods, yet, you must have these methods:

        drinkSomeRum() - intoxicates the Pirate.Pirate by one
        howsItGoingMate() - when called, the Pirate.Pirate replies:
        if drinkSomeRun() was called less than 4 times:
        "Pour me anudder!"
        else:
        "Arghh, I'ma Pirate.Pirate. How d'ya d'ink its goin?".
        Then the pirate passes out and sleeps it off (gets rid of the intoxication).
        If you manage to get this far, then you can try to do the following.

brawl(Pirate.Pirate) - where pirate fights another pirate (if both of them are alive):
there is 1/3 chance that this dies, the other dies or they both pass out.
die() - this kills off the pirate. When a pirate is dead, every method simply results in: he's dead.
And... if you get that far...

Add a parrot.
 */