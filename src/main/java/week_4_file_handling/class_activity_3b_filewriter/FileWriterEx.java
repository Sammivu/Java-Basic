package week_4.class_activity_3b_filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) {

        String desktopPath2 = System.getProperty("user.home") + "/Desktop";


        try{
            FileWriter fw = new FileWriter(desktopPath2 + "/output.csv");
            fw.write("I am learning how to write into a csv file");
            fw.close();

            System.out.println("successfully");
        }catch (Exception e){
            throw  new RuntimeException(e);
        }
    }
}
