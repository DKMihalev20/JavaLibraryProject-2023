import java.util.ArrayList;
import java.util.List;

public class Reader {
    private String name;
    private List<Book> borrowedBooks;

    public Reader(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book, Library library) {
        borrowedBooks.add(book);
        library.removeBook(book);

        System.out.println(name + " borrowed " + book.getTitle());
    }

    public void returnBook(Book book, Library library) {
        borrowedBooks.remove(book);
        library.addBook(book);

        System.out.println(name + " returned " + book.getTitle());
    }

    public void printListOfBorrowedBooksByTitle() {
        for(Book book : borrowedBooks) {
            System.out.println("Titles of borrowed books: " + book.getTitle());
        }
    }
}