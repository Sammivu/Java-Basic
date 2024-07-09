package week_5_java_collection.class_exercise_3b_meal_taken_ex.model;

import java.util.Comparator;

public class DecaDevsComparator implements Comparator<DecaDevs> {

    @Override
    public int compare(DecaDevs d1, DecaDevs d2) {
        if(d1.isFemale() && !d2.isFemale()){
            return -1;                              // d1 is a female, prioritize over d2

        }else if(!d1.isFemale() && d2.isFemale()){
            return 1;                      // d2 is a female,  prioritize over d1


        } else if (d1.isMale() && !d2.isMale()) {
            return  -1;

        } else if (!d1.isMale() && d2.isMale()) {
            return 1;

        }else

        return 0;
    }
}
