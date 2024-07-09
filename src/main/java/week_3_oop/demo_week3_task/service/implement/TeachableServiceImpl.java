package week_3_oop.class_activity_11a_arrays.demo_week3_task.service.implement;

import week_3_oop.class_activity_11a_arrays.demo_week3_task.model.Course;
import week_3_oop.class_activity_11a_arrays.demo_week3_task.model.Student;
import week_3_oop.class_activity_11a_arrays.demo_week3_task.model.Teacher;
import week_3_oop.class_activity_11a_arrays.demo_week3_task.service.CourseService;

//implement course services
public class TeachableServiceImpl implements CourseService {

    //implementing the course services by selecting the implement method
    @Override
    public void teachCourse(Teacher teacher, Course course) {

        //logic to help us implement the teacher
        System.out.println("Fullname: "
                + teacher.getName()
                + "\n" + "Gender: "
                + teacher.getGender() +
                "\n"+ "Age: "
                +teacher.getAge()+ "\n" + "Course: " + course.getCourseOffer());

    }

    @Override
    public void takeCourse(Student student, Course course) {
        System.out.println("Fullname: "+ student.getName()
                + "\n" + "Age: "+student.getAge()
                + "\n"+ "Gender: " + student.getGender()
                + "\n"+ "Course Taken: " + course.getCourseOffer());

    }
}
