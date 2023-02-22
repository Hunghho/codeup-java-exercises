package grades;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import util.Input;

public class GradesApplication {


    private static HashMap<String, Student> getStudents(){

        Student hung = new Student("Hung");
        Student horace = new Student("Horace");
        Student titus = new Student("Titus");
        Student batman = new Student("Batman");

        hung.addGrade(100);
        hung.addGrade(90);
        hung.addGrade(95);
        horace.addGrade(100);
        horace.addGrade(80);
        horace.addGrade(85);
        titus.addGrade(90);
        titus.addGrade(80);
        titus.addGrade(70);
        batman.addGrade(100);
        batman.addGrade(100);
        batman.addGrade(100);

        HashMap<String, Student> students = new HashMap<>();

        students.put("hung", hung);
        students.put("horace", horace);
        students.put("titus", titus);
        students.put("batman", batman);

        return students;
    }

    public static void doGradeApplication(){
        HashMap<String, Student> students = getStudents();
        System.out.printf("""
                Welcome!
                                
                Here are the GitHub usernames of our students:%n""");
        System.out.println();

        for(Map.Entry<String, Student> student : students.entrySet()){
            System.out.printf("|%s| ", student.getKey());
        }
        System.out.println();
        System.out.println();
        System.out.println("What student would you like to see more information on?");
        Scanner sc = new Scanner(System.in);

        String userEnter = sc.next();
        if (students.containsKey(userEnter)) {
            Student selectedStudent = students.get(userEnter);
            System.out.printf("Name: %s - GitHub Username: %s%nCurrent Average: %s%n", selectedStudent.getName(), userEnter, selectedStudent.getGradeAverage());
        } else {
            System.out.printf("Sorry, no student found with the GitHub username of %s%n", userEnter);
        }
    }

    public static void main(String[] args) {
        do{
            doGradeApplication();
        }while(Input.yesNo("Would you like to see another student? (y/n)"));
    }
}
