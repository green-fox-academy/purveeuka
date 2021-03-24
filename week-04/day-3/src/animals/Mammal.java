package animals;

public class Mammal extends Animal {

    public Mammal(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public String breed() {
        return "pushing miniature versions out.";
    }

    @Override
    public void sound() {
        System.out.println("baby Koala is squeaking...");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public String getGender() {
        return super.getGender();
    }
}
