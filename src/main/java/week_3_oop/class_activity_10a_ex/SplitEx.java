package week_3_oop.class_activity_11a_arrays.class_activity_10a_ex;

import java.util.Arrays;

public class SplitEx {
    public static void main(String[] args) {
        String s1 = "This is a java split method";
        System.out.println("Before splitting : "+ s1);
//Converting String to an Array
        String[] words = s1.split("\\s");
//using enhanced loop to break them to
        for(String w: words)
            System.out.println(w);

        System.out.println(Arrays.deepToString(words));
    }
}
