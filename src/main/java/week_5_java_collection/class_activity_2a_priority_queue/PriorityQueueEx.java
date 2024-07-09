package week_5_java_collection.class_activity_2a_priority_queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueEx {
    public static void main(String[] args) {

        //working on FIFO process
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("One");
        queue.add("Two");
        queue.add("Three");
        queue.add("Four");
        queue.add("Five");
        queue.add("Six");

        System.out.println(queue);

        // Note: the is using the Natural ordering and not LIFO
        // Natural ordering in an ascending order meaning it moves from down up
        Iterator<String> iterator = queue.iterator();

        while(iterator.hasNext()){
            String number = iterator.next();
            System.out.println(number);
        }

    }
}
