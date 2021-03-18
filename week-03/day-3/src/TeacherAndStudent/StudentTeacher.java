package TeacherAndStudent;

public class StudentTeacher {
    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher();

        teacher.teach(student);
        student.question(teacher);
    }
}
