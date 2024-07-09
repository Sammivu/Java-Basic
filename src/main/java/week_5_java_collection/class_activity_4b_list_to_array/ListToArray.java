package week_5_java_collection.class_activity_4b_list_to_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Pawpaw");

        String [] convertToArray = fruits.toArray(fruits.toArray(new String[0]));
        System.out.println("Array: "+ Arrays.toString(convertToArray));
    }
}
