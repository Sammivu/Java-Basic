package week_5_java_collection.class_activitiy_4a_array_to_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {

        //create an array
        String[] stacks = {"java", "node", "Python"};

        System.out.println("Array: " + Arrays.toString(stacks));

        System.out.println("******************************");

        //converting out array to list
        List <String> language = new ArrayList<>();
        for (String s : stacks){
            language.add(s);
        }

        System.out.println("List: "+ language);
    }
}
