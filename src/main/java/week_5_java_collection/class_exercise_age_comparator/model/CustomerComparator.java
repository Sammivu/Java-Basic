package week_5_java_collection.class_exercise_age_comparator.model;

import java.util.Comparator;

public class CustomerComparator implements Comparator<Customers> {

    @Override
    public int compare(Customers c1, Customers c2) {

        if (c1.isCustomerOld() && !c2.isCustomerOld()){
            return -1;
        } else if (!c1.isCustomerOld() && c1.isCustomerOld()) {
            return 1;

        } else if (c1.isCustomerYoung() && !c2.isCustomerYoung()) {
            return -1;

        } else if (!c1.isCustomerYoung() && c2.isCustomerYoung()) {
            return  1;

        }else
        return 0;
    }
}
