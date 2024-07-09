package week_3_oop.class_activity_11a_arrays.class_activity_9a_ex;

public class ReverseStringEx {


  public static String reverseString(String input){
      StringBuffer greetings = new StringBuffer(input);
      greetings.reverse();
        return greetings.toString();
    }

    public static void main(String[] args) {


        System.out.println(reverseString("Welcome"));
    }
}
