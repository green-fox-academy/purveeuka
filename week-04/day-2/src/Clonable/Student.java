package Clonable;

public class Student extends Person implements Cloneable {
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

    public Student clone() throws CloneNotSupportedException {
       Student student = new Student(this.getName(), this.getAge(), this.getGender(), this.previousOrganization);
       return student;
    }
}

