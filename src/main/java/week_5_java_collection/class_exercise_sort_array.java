package week_5_java_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class class_exercise_sort_array {
    public static void main(String[] args) {

        List<Integer> sortNumber = new ArrayList<>();
        sortNumber.add(50);
        sortNumber.add(30);
        sortNumber.add(70);
        sortNumber.add(40);
        sortNumber.add(10);

        Collections.sort(sortNumber);

        for(Integer myNumber: sortNumber){
            System.out.println(myNumber);
        }
    }
}
