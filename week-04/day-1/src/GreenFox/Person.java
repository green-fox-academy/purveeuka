package GreenFox;

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
    protected final String getGender() {
        return this.gender;
    }
    protected final int getAge() {
        return this.age;
    }
}
/*
    Create a GreenFox.Person class with the following fields:

        name: the name of the person
        age: the age of the person (whole number)
        gender: the gender of the person (male / female)
        And the following methods:

        introduce(): prints out "Hi, I'm name, a age year old gender."
        getGoal(): prints out "My goal is: Live for the moment!"
        And the following constructors:

        GreenFox.Person(name, age, gender)
        GreenFox.Person(): sets name to Jane Doe, age to 30, gender to female
 */
