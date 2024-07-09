package week_4.demo_task_assessment;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Main {
    public static void main(String[] args) throws IOException {

        //create an Array of student object
        Students [] students = {
                new Students(1, "oke", "usher", "03/03/1992", "Male", 33),
                new Students(2, "sido", "doe", "03/04/1999", "Female", 25),
                new Students(3, "isaka", "hang", "03/05/2001", "Male", 23),
                new Students(4, "Ayobami", "Olabode", "03/05/2000", "Male", 24),
                new Students(5, "Mallik", "hassan", "03/05/2002", "Female", 22),
        };


        //Step 2: write student objects into a  csv file
       String desktopPath = System.getProperty("user.home") + "/Desktop";

        try{
            FileWriter fw = new FileWriter( desktopPath + "/newstudents.csv" );


            fw.write("AdmissionId, Firstname, Lastname, DOB,Gender, Age\n");
            for(Students student:students ){
                fw.write(student.getAdmissionId()+ ",");
                fw.write(student.getFirstName()+ ",");
                fw.write(student.getLastName()+ ",");
                fw.write(student.getDateOfBirth()+ ",");
                fw.write(student.getGender()+ ",");
                fw.write(student.getAge()+ "\n");
            }
            fw.close();

            //fw.close();

            System.out.println("Students data have been written into the CSV file");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
