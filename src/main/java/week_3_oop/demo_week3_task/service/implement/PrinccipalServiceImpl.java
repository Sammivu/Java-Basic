package week_3_oop.class_activity_11a_arrays.demo_week3_task.service.implement;

import week_3_oop.class_activity_11a_arrays.demo_week3_task.model.Principal;
import week_3_oop.class_activity_11a_arrays.demo_week3_task.service.PrincipalServices;

public class PrinccipalServiceImpl implements PrincipalServices {


    @Override
    public void principalData(Principal principal) {
        System.out.println("Fullname: "+ principal.getName()+
                "\n"+ "Age: "+ principal.getAge()+
                "\n"+ "Gender: "+ principal.getGender());

    }
}
