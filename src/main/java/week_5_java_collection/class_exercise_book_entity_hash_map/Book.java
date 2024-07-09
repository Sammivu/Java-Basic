package week_5_java_collection.class_exercise_book_entity_hash_map;

public class Book {

    int iD;
    String bookTitle;
    String author;
    int quantity;

    public Book(int iD, String bookTitle, String author, int quantity) {
        this.iD = iD;
        this.bookTitle = bookTitle;
        this.author = author;
        this.quantity = quantity;
    }

    public int getiD() {
        return iD;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public int getQuantity() {
        return quantity;
    }
}
