package week_6_functional_programming.practice_space.class2;

import java.util.function.Function;

public class FunctionalI {
    //normal function
    static int increment (int number){
        return number + 1;
    }
    //Functional style
   static Function<Integer, Integer> incrementByOne = n-> n+ 1;

    public static void main(String[] args) {
        int calculate = increment(1);
        System.out.println(calculate);

        int calculate2 = incrementByOne.apply(1);
        System.out.println(calculate2);
    }
}
