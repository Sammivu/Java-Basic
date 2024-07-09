package week_5_java_collection.class_exercise_3a1_grade_tracker;

import java.util.HashMap;

public class GradeTracker {
    HashMap <Integer,Double> student;


    public GradeTracker(){
        student = new HashMap<>();
    }

    public void addGrade(int studentId, double grade){
        student.put(studentId,grade);
    }
    public double getGrade(int studentId){
        if (!student.containsKey(studentId)){
            return  -1.0;
        }
        return student.get(studentId);
    }


}
