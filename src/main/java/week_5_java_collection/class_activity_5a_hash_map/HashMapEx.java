package week_5_java_collection.class_activity_5a_hash_map;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {

        HashMap<Integer, String> fruits =new HashMap<>();
        fruits.put(1, "Mango");
        fruits.put(2,"Pawpaw");
        fruits.put(3,"Orange");
        fruits.put(4,"Banana");
        fruits.put(5,"Lime");


        for (Map.Entry<Integer, String> fruit : fruits.entrySet()) {
            Integer key = fruit.getKey();
            String value = fruit.getValue();
            System.out.println("Key=" + key + ", Value=" + value);
        }



    }
}
