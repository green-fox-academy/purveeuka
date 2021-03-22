package AirCrafts;

public class aircrafts {
    private int currentAmmo;
    private int maxAmmo;
    private int baseDamage;
    private String type;
    private boolean isPriority;
/*
    Create a class that represents an aircraft
        There are 2 types of AirCrafts.aircrafts: AirCrafts.F16 and AirCrafts.F35
        Both AirCrafts.aircrafts should keep track of their ammunition
    Methods
    fight
    It should use all the ammo (set it to 0) and it should return the damage it deals
    The damage dealt is calculated by multiplying the base damage by the ammunition
 */

    public int fight() {
        int damage = this.baseDamage * this.currentAmmo;
        setCurrentAmmo(0);
        return damage;
    }
/*
    refill
    It should take a number as parameter and subtract as much ammo as possible
    It can't have more ammo than the number or the max ammo (can't get more ammo than what's coming from the parameter or the max ammo of the aircraft)
    It should return the remaining ammo
    Eg. Filling an empty AirCrafts.F35 with 300 would completely fill the storage of the aircraft and would return the remaining 288
 */
   public int refill(int ammAmount) {
       if (maxAmmo > ammAmount) {
           currentAmmo = ammAmount;
       } else {
           currentAmmo = maxAmmo;
       }

       ammAmount = ammAmount - currentAmmo;
       return ammAmount;
   }
/*
    getType
    It should return the type of the aircraft as a string
 */
   public void setType(String type) {
       this.type = type;
   }

   public String getType() {
       return type;
   }
/*
    getStatus
    It should return a string like: Type AirCrafts.F35, Ammo: 10, Base Damage: 50, All Damage: 500
 */
   public String getStatus() {
       return  "Type: " + type + ", Ammo: " + currentAmmo + ", Base Damage: "
            + baseDamage + ", All damage: " + currentAmmo * baseDamage;
   }
/*
    isPriority
    It should return if the aircraft is priority in the ammo fill queue. It's true for AirCrafts.F35 and false for AirCrafts.F16
 */
   public boolean isPriority() {
       return isPriority;
   }

   public void setPriority(boolean priority) {
        isPriority = priority;
   }

   public void setCurrentAmmo(int currentAmmo) {
        this.currentAmmo = currentAmmo;
   }

   public int getCurrentAmmo() {
        return currentAmmo;
   }

   public void setMaxAmmo(int maxAmmo) {
        this.maxAmmo = maxAmmo;
   }

   public int getMaxAmmo() {
       return maxAmmo;
   }

   public void setBaseDamage(int baseDamage) {
       this.baseDamage = baseDamage;
   }

   public int getBaseDamage() {
       return baseDamage;
   }
}
