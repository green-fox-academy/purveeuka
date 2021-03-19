package SharpieSet;

import java.util.ArrayList;

public class Sharpie {
    private ArrayList<Sharpie> sharpies;
    String color;
    float width;
    float inkAmount = 100f;

    public Sharpie(String color, float width) {
        this.color = color;
        this.width = width;
    }
    public float getInkAmount() {
        return inkAmount;
    }

    public void use() {
        this.inkAmount--;
        System.out.println(inkAmount);
        System.out.println("-----------");
    }

    public String toString(){
        return "Sharpies: " + sharpies + '\n' + "color: " + color + '\n' +  "width: " + width + '\n' +  "Ink Amount=" + inkAmount + '\n';
    }
}
/*
    Reuse your SharpieSet.SharpieSet.Sharpie class
Create SharpieSet.SharpieSet class
it contains a list of SharpieSet.SharpieSet.Sharpie
it has a method that adds a new SharpieSet.SharpieSet.Sharpie to the set: add(sharpie)
it has a method that returns the number of usable Sharpies: countUsable() -> sharpie is usable if it contains ink
it has a method that removes all unusable Sharpies: removeTrash()
 */