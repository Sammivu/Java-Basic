package week_5_java_collection.class_activity_2b_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();
        Person p1 = new Person("Sampson Gbewa", 30);
        Person p2 = new Person("Alabo Hamlet", 25);
        Person p3 = new Person("Sunday Agbo", 40);
        Person p4 = new Person("Royal Mathias", 16);

        //Add the persons to a list
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);

        //We sort the above items
        Collections.sort(people,new AgeComparator());
        for (Person persons :people){
            System.out.println(persons.getFullName()+ "_"+ persons.getAge());
        }

    }
}
