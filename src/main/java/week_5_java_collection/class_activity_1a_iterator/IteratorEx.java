package week_5_java_collection.class_activity_1a_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {
    public static void main(String[] args) {

        //How to iterate over an elements
        List<String> cityName = new ArrayList<>();
        cityName.add("Enugu");
        cityName.add("Awka");
        cityName.add("Benin");
        cityName.add("Kaduna");
        cityName.add("Ph");

        System.out.println(cityName);
        // implementing the Iterator
        Iterator <String> iterates = cityName.iterator();

        while(iterates.hasNext()){
            String city = iterates.next();
            System.out.println(city);
        }













    }
}
