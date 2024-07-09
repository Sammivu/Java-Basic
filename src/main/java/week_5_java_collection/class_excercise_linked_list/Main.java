package week_5_java_collection.class_excercise_linked_list;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> fruits = new LinkedList();
        fruits.add("Banana");
        fruits.add("Pawpaw");
        fruits.add("Pear");

        for(String myFruit: fruits){
            System.out.println(myFruit);
        }
    }
}
