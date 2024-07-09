package week_5_java_collection.class_excercise_book_entity_linked_list;

public class Book {

    private int iD;
    private String bookTitle;
    private String author;
    private int bookQuantity;

    public Book(int iD, String bookTitle, String author, int bookQuantity) {
        this.iD = iD;
        this.bookTitle = bookTitle;
        this.author = author;
        this.bookQuantity = bookQuantity;
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

    public int getBookQuantity() {
        return bookQuantity;
    }
}
