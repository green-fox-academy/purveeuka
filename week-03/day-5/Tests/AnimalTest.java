import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTest {

    @Test
    public void createAnimalWithDefaultValues(){
        Animal cat = new Animal();

        assertEquals(50, cat.thirst);
    }

    @Test
    public void createAnimalWith10HungerAndThirst(){
        Animal dog = new Animal(10, 10);

        assertEquals(10, dog.hunger);
    }

    @Test
    public void animalEat(){
        Animal cat = new Animal();
        cat.eat();

        assertEquals(49, cat.hunger);
    }

    @Test
    public void animalDrink(){
        Animal cat = new Animal();
        cat.drink();
        assertEquals(0, cat.thirst);
    }

    @Test
    public void AnimalPlaysFiveTimes(){
        Animal cat = new Animal();

        for (int i = 0; i < 5; i ++) {
            cat.play();
        }
        assertEquals(55, cat.hunger, cat.thirst);
    }

    @Test
    public void createAnimalWith0ValueAndPlay() {
        Animal cat = new Animal(0, 0);
        cat.play();
        assertEquals(1, cat.hunger, cat.thirst);
    }
}