package SharpieSet;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    private List<Sharpie> sharpies;
    public SharpieSet(){
        this.sharpies = new ArrayList<>();
    }
    public void add( Sharpie sharpie){

        sharpies.add(sharpie);
    }
    public int countUsable(){
        int i = 0;
        for (Sharpie sharpie:this.sharpies) {
            if (sharpie.inkAmount > 0) {
                i++;
            }
        }
        return i;
    }
    public void removeTrash() {
        for (int i = 0; i < sharpies.size() ; i++) {
            if (sharpies.get(i).getInkAmount() == 0) {
                sharpies.remove(sharpies.get(i));
            }
        }
    }
    public String toString() {

        return "Usable sharpies" + sharpies + '\n';
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