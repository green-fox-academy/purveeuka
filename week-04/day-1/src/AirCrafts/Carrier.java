package AirCrafts;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
     /*
    Create a class that represents an aircraft-carrier

    The carrier should be able to store AirCrafts.aircrafts
    Each carrier should have a store of ammo represented as number
    The initial ammo should be given by a parameter in its constructor
    The carrier also has a health point given in its constructor as well

      */
    private List<aircrafts> carrier;
    private int WholeAmmoAmount;
    private int healthPoint;

    public void setAmmoAmount(int ammoAmount) {
        this.WholeAmmoAmount = ammoAmount;
    }

    public int getAmmoAmount() {
        return WholeAmmoAmount;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public  Carrier(int ammoAmount, int healthPoint) {
        carrier = new ArrayList<>();
        this.WholeAmmoAmount= ammoAmount;
        this.healthPoint = healthPoint;
    }

    public List<aircrafts> getCarrier(){
        return carrier;
    }

    public void setCarrier(List<aircrafts> carrier) {
        this.carrier = carrier;
    }

    /*
        Methods
        add
        It should take a new aircraft and add it to its storage
         */
    public void add(aircrafts aircrafts) {
        carrier.add(aircrafts);
    }
    /*
    fill
    It should fill all the aircraft with ammo and subtract the needed ammo from the ammo storage
    If there is not enough ammo then it should start to fill the AirCrafts.aircrafts with priority first
    If there is no ammo when this method is called, it should throw an exception
     */
    public void fill() {
        int maxAmmo = 0;
        for (aircrafts aircrafts:carrier) {
            maxAmmo = maxAmmo + aircrafts.getMaxAmmo();
        }
        if (WholeAmmoAmount < maxAmmo) {
            for (aircrafts aircrafts:carrier) {
                if (aircrafts.isPriority()) {
                    setAmmoAmount(aircrafts.refill(WholeAmmoAmount));
                }
            }
        }else {
            for (aircrafts aircrafts : carrier) {
                setAmmoAmount(aircrafts.refill(WholeAmmoAmount));
            }
        }
    }

/*
    fight
    It should take another carrier as a reference parameter and fire all the ammo from the AirCrafts.aircrafts to it,
    then subtract all the damage from its health points

 */
    public void fight(Carrier anotherCarrier){
        int damageMade = 0;
        for (aircrafts aircrafts:this.getCarrier()) {
            damageMade = damageMade + aircrafts.fight();
        }
        anotherCarrier.setHealthPoint(anotherCarrier.getHealthPoint() - damageMade);

        for (aircrafts aircrafts:this.getCarrier()) {
            aircrafts.setCurrentAmmo(0);
        }
    }
/*
    getStatus
    It should return a string about itself and all of its AirCrafts.aircrafts' statuses in the following format:

    HP: 5000, Aircraft count: 5, Ammo Storage: 2300, Total damage: 2280
    Aircrafts:
    Type AirCrafts.F35, Ammo: 12, Base Damage: 50, All Damage: 600
    Type AirCrafts.F35, Ammo: 12, Base Damage: 50, All Damage: 600
    Type AirCrafts.F35, Ammo: 12, Base Damage: 50, All Damage: 600
    Type AirCrafts.F16, Ammo: 8, Base Damage: 30, All Damage: 240
    Type AirCrafts.F16, Ammo: 8, Base Damage: 30, All Damage: 240
    If the health points are 0 then it should return: It's dead Jim :(
 */
    public void getStatus(){
        int totalDamage = 0;
        for (aircrafts aircrafts: this.getCarrier()) {
            totalDamage = totalDamage + aircrafts.getBaseDamage() * aircrafts.getCurrentAmmo();
        }
        System.out.println("HP: " + getHealthPoint() + " Aircraft count: " + this.getCarrier().size() + ", Ammo Storage: " +
                getAmmoAmount() + " Total damage: " + totalDamage);
        System.out.println("Aircrafts:");

        for (aircrafts aircrafts:this.getCarrier()) {
            System.out.println(aircrafts.getStatus());
        }

        if (healthPoint == 0) {
            System.out.println("It's dead Jim :(");
        }
    }
}
