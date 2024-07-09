package week_4.class_activity_1a_writer_ex;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterEx {
    public static void main(String[] args) {

        // How to write to a file and create a file at a specific path
        String desktopPath= System.getProperty("user.home") + "/Desktop";

        try{
            Writer ar = new FileWriter((desktopPath) + "/output.csv");
            String fileContent = "I am learning to write to a csv file";
            ar.write(fileContent);
            ar.close();
            System.out.println(fileContent);
            System.out.println("Successfully wrote to a csv file");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
