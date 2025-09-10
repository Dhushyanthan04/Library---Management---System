import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void issueBook(Book book, Member member) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            member.borrowBook(book);
            System.out.println("Book '" + book.getTitle() + "' issued to " + member.getName());
        } else {
            System.out.println("Book '" + book.getTitle() + "' is not available right now.");
        }
    }

    public void returnBook(Book book, Member member) {
        if (member.getBorrowedBooks().contains(book)) {
            book.setAvailable(true);
            member.returnBook(book);
            System.out.println("Book '" + book.getTitle() + "' returned by " + member.getName());
        } else {
            System.out.println(member.getName() + " did not borrow '" + book.getTitle() + "'");
        }
    }

    public void showAvailableBooks() {
        System.out.println("Available Books:");
        for (Book b : books) {
            if (b.isAvailable()) {
                System.out.println("- " + b.getTitle());
            }
        }
    }
}
