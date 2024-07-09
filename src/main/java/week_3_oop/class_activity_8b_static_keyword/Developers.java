package week_3_oop.class_activity_11a_arrays.class_activity_8b_static_keyword;

public class Developers {
    int id;
    String name;

    static String institute = "Decagon";

    public Developers(int id, String name){
        this.id = id;
        this.name = name;


    }
    void display(){
        System.out.println(id+ " "+ name+ " "+institute);
    }
}
