package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;


    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade (int grade){
        this.grades.add(grade);
    }

    public double getGradeAverage(){
        double sum = 0;
        for (int i = 0 ; i < grades.size(); i += 1){
            sum += grades.get(i);
        }
//        System.out.println(name + " Grades = " + grades);
        return sum / this.grades.size();
    }
}
