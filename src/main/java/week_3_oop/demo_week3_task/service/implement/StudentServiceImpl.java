package week_3_oop.class_activity_11a_arrays.demo_week3_task.service.implement;

import week_3_oop.class_activity_11a_arrays.demo_week3_task.model.Principal;
import week_3_oop.class_activity_11a_arrays.demo_week3_task.model.Student;
import week_3_oop.class_activity_11a_arrays.demo_week3_task.service.StudentService;

public class StudentServiceImpl implements StudentService {

    public void expelStudent( Student student, Principal principal){
        System.out.println("Student Fullname: "+ student.getName()+
                "\n"+ "Expulsion Duration: "+ "2 WEEKS"+
                "\n"+ "Expelled by: Principal "+ principal.getName());
    }
}
