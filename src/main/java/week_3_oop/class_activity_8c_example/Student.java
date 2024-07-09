package week_3_oop.class_activity_11a_arrays.class_activity_8c_example;

public  class Student {

    int matricNo;
    String studentName;

    public Student(int matricNo, String studentName) {
        this.matricNo = matricNo;
        this.studentName = studentName;
    }
    static String university= "uniben";

    static void  changeUniversity(){
        university= "Covernant";
    }



    void display(){
        System.out.println(matricNo+ " "+ studentName+ " "+ university);
    }

}