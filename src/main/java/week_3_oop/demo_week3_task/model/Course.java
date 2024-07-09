package week_3_oop.class_activity_11a_arrays.demo_week3_task.model;

import week_3_oop.class_activity_11a_arrays.demo_week3_task.enums.CourseOffer;

public class Course {
    public CourseOffer courseOffer;

    //constructor
    public Course(CourseOffer courseOffer) {
        this.courseOffer = courseOffer;
    }

    //getter
    public CourseOffer getCourseOffer() {
        return courseOffer;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseOffer=" + courseOffer +
                '}';
    }
}
