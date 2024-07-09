package week_3_oop.class_activity_11a_arrays.demo_week3_task;

import week_3_oop.class_activity_11a_arrays.demo_week3_task.enums.CourseOffer;
import week_3_oop.class_activity_11a_arrays.demo_week3_task.enums.Gender;

import week_3_oop.class_activity_11a_arrays.demo_week3_task.service.implement.ApplicantServiceImpl;
import week_3_oop.class_activity_11a_arrays.demo_week3_task.service.implement.PrinccipalServiceImpl;
import week_3_oop.class_activity_11a_arrays.demo_week3_task.service.implement.StudentServiceImpl;
import week_3_oop.class_activity_11a_arrays.demo_week3_task.service.implement.TeachableServiceImpl;
import week_3_oop.class_activity_11a_arrays.demo_week3_task.model.*;

public class SchoolSystem {

    public static void main(String[] args) {
        Teacher teacher1 =new Teacher("Segun Osiki", 23, Gender.MALE);
        Teacher teacher2 = new Teacher("Kiki Oladejo", 30, Gender.FEMALE);

        Course course1 = new Course(CourseOffer.JAVA);
        Course course2 = new Course(CourseOffer.NODE_JS);

        Principal principal1 = new Principal("Hopkins", 70,Gender.FEMALE);
        PrinccipalServiceImpl principalData = new PrinccipalServiceImpl();

        Student student3 = new Student("Royal", 12,Gender.FEMALE);
        StudentServiceImpl expelStudent = new StudentServiceImpl();

        Applicants applicants1 = new Applicants("Hamlet", 19, Gender.MALE);
        Applicants applicants2 = new Applicants("Jennifer", 12, Gender.FEMALE);
        ApplicantServiceImpl applicantData = new ApplicantServiceImpl();

        Student student1 = new Student("philip oke", 25, Gender.MALE);
        Student student2 = new Student("George Nnanna", 70, Gender.FEMALE);

        TeachableServiceImpl teachableService1 = new TeachableServiceImpl();
        TeachableServiceImpl teachableService2 = new TeachableServiceImpl();

        System.out.println("Teacher Data");
        teachableService1.teachCourse(teacher1, course1);
        System.out.println("************************");

        System.out.println("Teacher Data");
        teachableService2.teachCourse(teacher2, course2);
        System.out.println("************************");

        System.out.println("Student Data");
        teachableService1.takeCourse(student1, course1);
        System.out.println("************************");

        System.out.println("Student Data");
        teachableService2.takeCourse(student2, course2);
        System.out.println("************************");

        System.out.println("Principal Data");
        principalData.principalData(principal1);
        System.out.println("************************");

        System.out.println("Student Expelled");
        expelStudent.expelStudent(student3, principal1);
        System.out.println("************************");

        System.out.println("Applicant Data");
        applicantData.displayApplicantData(applicants1);
        applicantData.displayApplicantData(applicants2);
        System.out.println("************************");

        System.out.println("Successful Admission Data");
        applicantData.admitStudent(applicants1);
        System.out.println("************************");

        System.out.println("Admission Denied Data");
        applicantData.admitStudent(applicants2);







    }
}
