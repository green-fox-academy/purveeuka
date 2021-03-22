package GreenFox;

import java.util.ArrayList;
import java.util.List;

public class Cohort {
    private String name;
    private List<Student> students;
    private  List<Mentor> mentors;

    public void addStudent(Student student){
        students.add(student);
    }

    public void addMentor(Mentor mentor) {
        mentors.add(mentor);
    }

    public void info(){
        System.out.println("The " + name + " cohort has " + students.size() + " students and " + mentors.size() + " mentors." );
    }

    public Cohort(String name){
        this.name = name;
        this.students = new ArrayList<>();
        this.mentors = new ArrayList<>();
     }
}
/*
    Create a GreenFox.Cohort class that has the following

        fields:
        name: the name of the cohort
        students: a list of Students
        mentors: a list of Mentors
        methods:
        addStudent(GreenFox.Student): adds the given GreenFox.Student to students list
        addMentor(GreenFox.Mentor): adds the given GreenFox.Mentor to mentors list
        info(): prints out "The name cohort has students.size() students and mentors.size() mentors."
        The GreenFox.Cohort class has the following constructors:

        GreenFox.Cohort(name): beside the given parameter, it sets students and mentors as empty lists
 */