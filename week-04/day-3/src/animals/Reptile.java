package animals;

public class Reptile  extends Animal{

    public Reptile(String name, int age, String gender) {
        super(name,age, gender);
    }

    @Override
    public String breed() {
        return "laying eggs.";
    }

    @Override
    public void sound() {
        System.out.println("Crocodile is snarling.....");
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
