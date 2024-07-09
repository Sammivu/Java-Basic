package week_5_java_collection.class_activity_2b_comparator;

import java.util.Comparator;

//we are comparing age, so we
public class AgeComparator implements Comparator<Person> {

    //Implement the comparator by overriding
    @Override
    public int compare(Person p1, Person p2) {

        //p1 is our person object
        //p2 is another object
        if (p1.getAge()> p2.getAge()){

            return 1;
        } else if (p1.getAge() < p2.getAge()) {
            return -1;

        }else
        return 0;

    }
}
