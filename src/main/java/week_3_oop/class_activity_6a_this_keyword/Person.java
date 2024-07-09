package week_3_oop.class_activity_11a_arrays.class_activity_6a_this_keyword;

public class Person {
    String firstName;

    String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //void method
    void display(){
        System.out.println(firstName + " "+ lastName);
    }
}
