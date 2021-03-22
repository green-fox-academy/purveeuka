package GreenFox;

public class Student  extends Person {
    private String previousOrganization;
    private  int skippedDays;

   public Student(String name, int age, String gender, String previousOrganization){
       super(name, age, gender);
       this.previousOrganization = previousOrganization;
       this.skippedDays = 0;
   }
   public Student(){
       super("Jane Doe", 30, "Female");
       this.previousOrganization = "The School of Life";
       this.skippedDays = 0;
   }

   public void getGoal() {
       System.out.println("My goal is: Be a junior software developer.");
   }
   @Override
   public void introduce(){
       System.out.println("Hi, I'm " + this.getName() + " and I'm " + this.getAge() + " years old, " + this.getGender() + " from "
               + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
   }
    public void skipDays(int numberOfDays) {
       this.skippedDays = this.skippedDays + numberOfDays;
    }
}
/*
Create a GreenFox.Student class that has the same fields and methods as the GreenFox.Person class, and has the following additional

fields:
previousOrganization: the name of the student’s previous company / school
skippedDays: the number of days skipped from the course
methods:
getGoal(): prints out "Be a junior software developer."
introduce(): "Hi, I'm name, a age year old gender from previousOrganization who skipped skippedDays days from the course already."
skipDays(numberOfDays): increases skippedDays by numberOfDays
The GreenFox.Student class has the following constructors:
GreenFox.Student(name, age, gender, previousOrganization): beside the given parameters, it sets skippedDays to 0
GreenFox.Student(): sets name to Jane Doe, age to 30, gender to female, previousOrganization to The School of Life, skippedDays to 0
 */