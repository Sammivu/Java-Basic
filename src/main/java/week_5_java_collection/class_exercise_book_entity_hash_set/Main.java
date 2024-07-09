package week_5_java_collection.class_exercise_book_entity_hash_set;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        Set<Book> books =new HashSet<>();
        Book book1 = new Book(1, "Things fall Apart", "Chinua Achebe", 2);
        Book book2 = new Book(2, "Principles Of Money","Mathew Mulwa", 5);
        Book book3 = new Book(3, "Purple Hibiscus", "Chimamanda Ngozi Adichie", 20);
        Book book4 = new Book(4, "The Secret Lives of Baba Segi's Wives", "Chimamanda Lola Shoneyin", 3);
        Book book5 = new Book(5, "Stay with Me", "Ayọ̀bámi Adébáyọ̀", 1);

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);


        for(Book book: books) {
            System.out.println(book.getiD()+", "+book.getBookTitle()+ ", "+book.getAuthor()+ ", "+book.getQuantity());
        }
    }
}
