package week_3_oop.class_activity_11a_arrays.class_activity_1B;

public class SuperClass {
    public SuperClass(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    private  String name;
    private int age;
    private String gender;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    void display(){
        System.out.println(name);
    }
}
