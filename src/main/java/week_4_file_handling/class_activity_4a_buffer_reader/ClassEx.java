package week_4.class_activity_4a_buffer_reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClassEx {
    public static void main(String[] args) {

        String desktopPath = System.getProperty("user.home") + "Desktop";
        String filePath = desktopPath +"/ student copy 2.csv";

        List <String> message = new ArrayList<>();

        try{
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = br.readLine()) != null){
                message.add(line);
            }
            br.close();
            System.out.println("Successfully added to an Array list");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
        String [] massageArray = message.toArray(new String[0]);
        for (String ms: massageArray){
            System.out.println(String.join(ms));

        }


    }
}
