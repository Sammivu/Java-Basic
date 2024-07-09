package week_5_java_collection.class_exercise_3a1_grade_tracker;

public class Main {

    public static void main(String[] args) {

        GradeTracker student = new GradeTracker();
        student.addGrade(1, 59.2);
        student.addGrade(2, 70.0);
        student.addGrade(3, 90.0);

        System.out.println(student.getGrade(1));


    }
}