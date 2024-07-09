package week_4.class_activity_5a_java_files;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {

        String desktopPath = System.getProperty("user.home")+ "/Desktop";

        File file = new File(desktopPath + "/myFile.csv");
            if (file.delete()){
                System.out.println("file is deleted");
        }else{
                System.out.println("File has already been deleted");
            }
    }
}
