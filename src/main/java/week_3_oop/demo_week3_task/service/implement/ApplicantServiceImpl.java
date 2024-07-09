package week_3_oop.class_activity_11a_arrays.demo_week3_task.service.implement;

import week_3_oop.class_activity_11a_arrays.demo_week3_task.model.Applicants;
import week_3_oop.class_activity_11a_arrays.demo_week3_task.service.ApplicantService;

public class ApplicantServiceImpl implements ApplicantService {

    public void displayApplicantData(Applicants applicants) {
        System.out.println("Fullname: "+ applicants.getName()+
                "\n"+ "Age: "+ applicants.getAge()+
                "\n"+ "Gender: "+ applicants.getGender());

    }

    public void admitStudent(Applicants applicants) {
        if (applicants.getAge()>= 18){
            System.out.println("CONGRATULATION!!!, YOU HAVE BEEN ADMITTED");
        }else{
            System.out.println("YOU HAVE BEEN REJECTED");
        }
    }


}
