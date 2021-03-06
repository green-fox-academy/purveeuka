package GreenFox;

import GreenFox.Person;

public class Sponsor extends Person {
    private String company;
    private int hiredStudents;
    public Sponsor(String name, int age, String gender, String company){
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = 0;
    }
    public Sponsor(){
        super("Jane Doe", 30, "female");
        this.company = "Google";
        this.hiredStudents = 0;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + this.getName() + " " + this.getAge() + " years old "
                + this.getGender() + " and I work at " + this.company + " I have hired " + this.hiredStudents + " students so far.");
    }

    public void hire(){
        this.hiredStudents++;
    }

    public void getGoal(){
        System.out.println("My goal is: Hire brilliant junior software developers.");
    }
}
/*
GreenFox.Sponsor
        Create a GreenFox.Sponsor class that has the same fields and methods as the GreenFox.Person class, and has the following additional

        fields:
        company: name of the company
        hiredStudents: number of students hired
        method:
        introduce(): "Hi, I'm name, a age year old gender who represents company and hired hiredStudents students so far."
        hire(): increase hiredStudents by 1
        getGoal(): prints out "Hire brilliant junior software developers."
        The GreenFox.Sponsor class has the following constructors:

        GreenFox.Sponsor(name, age, gender, company): beside the given parameters, it sets hiredStudents to 0
        GreenFox.Sponsor(): sets name to Jane Doe, age to 30, gender to female, company to Google and hiredStudents to 0
 */