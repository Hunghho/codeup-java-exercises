package grades;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Hung");
        student1.addGrade(100);
        Student student2 = new Student("Horace");
        student2.addGrade(95);
        Student student3 = new Student("Titus");
        student3.addGrade(90);
        student3.addGrade(70);
        student3.addGrade(60);

        System.out.println(student3.getGradeAverage());
    }
}
