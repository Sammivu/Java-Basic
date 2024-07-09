package week_4.class_activity_4a_buffer_reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BufferReaderEx {
    public static void main(String[] args) {

        String desktopPath = System.getProperty("user.home")+ "/Desktop";

        String filepath =desktopPath + "/newstudents.csv";

        List<String> message = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(filepath));
            String line;

            while ((line = br.readLine()) != null){
                message.add(line);
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        String [] messageArray = message.toArray(new String[0]);
        for (String ms: messageArray) {
            System.out.println(ms);
        }
    }
}
