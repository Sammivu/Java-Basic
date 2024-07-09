package week_5_java_collection.class_activity_array_list;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Pawpaw");
        fruits.add("Orange");
        fruits.add("Banana");

        System.out.println(fruits.get(2));
        System.out.println(fruits.size());
        System.out.println(fruits.contains("pear"));

//        fruits.clear();
//        for  (String fruit: fruits) {
//            System.out.println(fruit);
//
//        }


    }
}
