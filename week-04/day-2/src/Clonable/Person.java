package Clonable;

public class Person {
    private String name;
    private int age;
    private String gender;
    public Person() {
        name = "Jane Doe";
        age = 30;
        gender = "female";
    }

    public Person(String name, int age, String gender){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hi I'm " + name + " and I'm  " + age + " years old, " + gender + ". ");
    }

    public void getGoal() {
        System.out.println("My goal is: Live for the moment!");
    }

    protected  final String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    protected final String getGender() {
        return this.gender;
    }

    protected final int getAge() {
        return this.age;
    }
}
