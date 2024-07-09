package week_6_functional_programming.class_exercise_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Abayomi", 24);
        Student student2 = new Student("Chinecherem", 19);
        Student student3 = new Student("Sampson", 21);


        List<Student> student = new ArrayList<>();
        student.add(student1);
        student.add(student2);
        student.add(student3);



//        student.sort((st1, st2)-> Student.compareTo(st1.getName(), st2.getName()));
        student.sort(Comparator.comparing(Student::getName));

        student.sort((st1, st2) -> st1.getName().compareTo(st2.getName()));

        student.forEach(s -> System.out.println(s));

    }
}
