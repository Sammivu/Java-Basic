package week_4.class_activity_2a;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderEx {
    public static void main(String[] args) {

        String filePath=  System.getProperty("user.home") + "/Desktop";

        try{
            Reader re = new FileReader((filePath) + "/output.csv");

            int readContent = re.read();

            while (readContent !=-1){
                System.out.println((char) readContent);
                readContent = re.read();
            }
            re.close();


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
