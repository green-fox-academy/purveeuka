package GreenFox;

public class Mentor extends Person {
    private String level;
    public Mentor(String name, int age, String gender, String level){
       super(name, age, gender);
       this.level = level;
    }
    public Mentor(){
        super("Jane Doe", 30, "female");
        this.level = "intermediate";
    }
    public void introduce(){
        System.out.println("Hi, I'm " +this.getName() + " " + this.getAge() + " years old "
                + this.getGender() + " and an " + this.level + " mentor");
    }

    public void getGoal() {
        System.out.println("My goal is: Educate brilliant junior software developers.");
    }
}
/*
    Create a GreenFox.Mentor class that has the same fields and methods as the GreenFox.Person class, and has the following additional

        fields:
        level: the level of the mentor (junior / intermediate / senior)
        methods:
        getGoal(): prints out "Educate brilliant junior software developers."
        introduce(): "Hi, I'm name, a age year old gender level mentor."
        The GreenFox.Mentor class has the following constructors:

        GreenFox.Mentor(name, age, gender, level)
        GreenFox.Mentor(): sets name to Jane Doe, age to 30, gender to female, level to intermediate
 */
