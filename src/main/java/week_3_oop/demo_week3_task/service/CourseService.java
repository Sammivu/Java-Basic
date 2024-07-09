package week_3_oop.class_activity_11a_arrays.demo_week3_task.service;

import week_3_oop.class_activity_11a_arrays.demo_week3_task.model.Course;
import week_3_oop.class_activity_11a_arrays.demo_week3_task.model.Student;
import week_3_oop.class_activity_11a_arrays.demo_week3_task.model.Teacher;

public interface CourseService {

    void  teachCourse(Teacher teacher, Course course);

    void takeCourse (Student student, Course course);

}
