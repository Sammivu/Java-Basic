package demo_project.service.implement;

import demo_project.enums.CourseOffer;
import demo_project.enums.Gender;
import demo_project.model.Course;
import demo_project.model.Student;
import demo_project.model.Teacher;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TeachableServiceImplTest {

    @Test
    void itShouldBeAbleToTeachCourse() {
        //Arrange
        //First Step:
        // Create a mock Teacher Object
        Student teacherInput = new Teacher("Segun Osiki", 23, Gender.MALE);

        //Create a mock course object
        Course course = new Course(CourseOffer.JAVA);

        //Create an Instance of teachableServiceImpl
        TeachableServiceImpl teachableService = new TeachableServiceImpl();

        ByteArrayOutputStream actualContent = new ByteArrayOutputStream();
        System.out.println(new PrintStream(actualContent));


        //Act
        //Third Step
        // Second Step: call the method being tested
        teachableService.takeCourse(teacherInput, course);


        //Assert
        //Fourth Step
        //Retrieve the output from the console
        String expected = "Fullname: Segun Osiki\nGender : MALE\nAge : 23\nCourse taught : JAVA\n ";

        System.out.println(expected, actualContent.toString());
    }

    @Test
    void itShouldBeAbleTotakeCourse() {
    }
}