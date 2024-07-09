package week_4.class_activity_5a_java_files;

import java.io.File;
import java.io.IOException;

public class FileEx {
    public static void main(String[] args) {

        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try{
            File file = new File(desktopPath + "/myFile.csv");
            if(file.createNewFile()){
                System.out.println("New file created");
            }else{
                System.out.println("File already exist");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
