package OOADlogic;

public class Book extends ReadingMaterial{
    private String isbn;
    public Book(String title, double price, String isbn) {
        super(price, title);
        this.isbn = isbn;
    }
    public String getIsbn() {
        return isbn;
    }
}
