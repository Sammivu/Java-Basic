package week_4.class_activity_3a;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStreamEx {
    public static void main(String[] args) {

//     String desktopPath = System.getProperty("user.home") + "/Desktop";
//
//
//     try{
//
//         String ar  = "I am still learning how to write to a file";
//         byte[] bytes = ar.getBytes();
//
//         out.
//
//        // out.close();
//
//         System.out.println("Successfully written to a file");
//     } catch (IOException e) {
//         throw new RuntimeException(e);
//     }
//    }

        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try{

            FileOutputStream okay = new FileOutputStream(desktopPath + "/output1.csv");
            String ar  = "I am still learning how to write to a file";
            byte[] bytes = ar.getBytes();

            okay.write(bytes);
            okay.close();

            System.out.println("Successfully written to a file");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
