import java.util.Locale;
import java.util.Scanner;

public class  Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int year = scanner.nextInt();

        Book book1 = new Book(title, author, year);
        BookProcessor bookTwo = new BookProcessor(book1);

        bookTwo.start();
        bookTwo.interrupt();
    }
}