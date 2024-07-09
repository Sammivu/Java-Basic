package week_5_java_collection.class_exercise_book_entity_hash_map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        Map<Integer,Book> bookMap = new HashMap<>();
        Book book1 = new Book(1, "Things fall Apart", "Chinua Achebe", 2);
        Book book2 = new Book(2, "Principles Of Money","Mathew Mulwa", 5);
        Book book3 = new Book(3, "Purple Hibiscus", "Chimamanda Ngozi Adichie", 20);
        Book book4 = new Book(4, "The Secret Lives of Baba Segi's Wives", "Lola Shoneyin", 3);
        Book book5 = new Book(5, "Stay with Me", "Ayọ̀bámi Adébáyọ̀", 1);

        bookMap.put(1,book1);
        bookMap.put(2,book2);
        bookMap.put(3, book3);
        bookMap.put(3,book3);
        bookMap.put(4,book4);
        bookMap.put(5, book5);

        for (Map.Entry<Integer, Book> book : bookMap.entrySet()){
            Integer key = book.getKey();
            Object Book = book.getKey();
            System.out.println("\n"+"Key=" + key + ", Value=" + Book);

            System.out.println("ID: " + book.getValue().getiD() + "\nTitle: " + book.getValue().getBookTitle() +
                    "\nAuthor: " + book.getValue().getAuthor() + "\nBook Quantity: " + book.getValue().getQuantity());

        }
    }
}
