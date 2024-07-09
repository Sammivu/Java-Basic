package week_3_oop.class_activity_11a_arrays.class_activity_2a;

public class OverloadingExample {
    //We use static here because we dont want to create an object to access the method

    //This is the syntax for method overloading
    //With this method multiple methods can have the same name with different parameters
    static int add(int a, int b){
        return a + b;
    }

    static int add (int a, int b, int c ){
        return a + b + c;
    }
}
