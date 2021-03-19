package Farm;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    List<Animal> animals = new ArrayList<>();
    int capacity;

    public Farm(int capacity) {
        this.capacity = capacity;
    }
    public void add(){
        if (capacity > animals.size()) {
            System.out.println("Breeding!");
        this.animals.add(new Animal());
        this.capacity --;
        } else System.out.println("no free slots!");
    }
    public void breed() {
        if (capacity > animals.size()) {
            this.animals.add(new Animal());
            this.capacity--;
        } else System.out.println("no free slots!");

    }
    public void sell() {
        int hungry = 50;
        for (Animal animal : animals) if (animal.hunger < hungry) hungry = animal.hunger;

        Animal leastHungry = new Animal();
        for (Animal a : animals) if (a.hunger == hungry) leastHungry = a;
        animals.remove(leastHungry);
        this.capacity++;
    }
}
/*
    Reuse your Farm.Animal class
Create a Farm.Farm class
it has a list of Animals
it has a limit that defines how many animals can be kept in the Farm.Farm
it has two methods:
breed() -> creates a new animal if there's place for it
sell() -> removes the least hungry animal
 */