package week_5_java_collection.class_excercise_book_entity_linked_list;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Book book1 = new Book(1, "How time flies","Hamlet",3);
        Book book2 =new Book(2,"Today is here", "Royal",9);
        Book book3 =new Book(3,"The future is here", "Yomi",1);
        Book book4 =new Book(4,"Life of a developer", "John",7);
        Book book5 =new Book(5,"Make money", "Uche",2);

        List<Book> books=new LinkedList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        for(Book book:books){
            System.out.println("ID: "+book.getiD()+" Title: "+ book.getBookTitle()+" Author: "+book.getAuthor()+" Book Quantity: "+book.getBookQuantity());
        }


    }
}
