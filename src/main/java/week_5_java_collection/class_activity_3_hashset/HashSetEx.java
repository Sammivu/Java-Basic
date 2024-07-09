package week_5_java_collection.class_activity_3_hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {

        Set<String> numbers = new HashSet<>();
        numbers.add("one");
        numbers.add("two");
        numbers.add("three");
        numbers.add("four");
        numbers.add("five");
        numbers.add("five");

        Iterator<String> iterator = numbers.iterator();
        while (iterator.hasNext()){
            String numb = iterator.next();
            System.out.println(numb);
        }



    }
}
