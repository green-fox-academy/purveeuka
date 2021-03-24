import Clonable.Student;

public class CloneableMain {
    public static void main(String[] args) {
        Student John = new Student("John",20,"male","BME");
       try{
            Student johnTheClone = John.clone();
            johnTheClone.introduce();
        } catch (CloneNotSupportedException c) {
            c.printStackTrace();
        }
        System.out.println();
    }
}
/*
   Every Object has a clone() method (so all of your classes will have an inherited one too), but by default it doesn't do anything.
   Get your Student and other relevant classes from the Green Fox Organization Exercise
   Override and implement the clone() method, so it clones the student. Cloning means: create an independent copy with the same attributes (fields).
   Instantiate John, a 20 years old male from BME
  Clone him into jonhTheClone

 */