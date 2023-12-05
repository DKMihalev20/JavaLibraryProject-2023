import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void printListOfBooksByTitle() {
        for(Book book : books) {
            System.out.println("Titles: " + book.getTitle());
        }
    }
}