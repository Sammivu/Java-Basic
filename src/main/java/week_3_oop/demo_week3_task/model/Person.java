package week_3_oop.class_activity_11a_arrays.demo_week3_task.model;

import week_3_oop.class_activity_11a_arrays.demo_week3_task.enums.Gender;

abstract public class Person {
    private String name;

    private  int age;

    private Gender gender;

    //An empty constructor
   // public Person() {
  //  }

    //Constructor
    public Person(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
// Getter and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

}
