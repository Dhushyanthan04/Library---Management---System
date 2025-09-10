public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book(1, "Java Basics");
        Book book2 = new Book(2, "Data Structures");
        library.addBook(book1);
        library.addBook(book2);

        Member member1 = new Member(101, "Priya");
        Member member2 = new Member(102, "Dhushy");

        library.showAvailableBooks();

        System.out.println("\n--- Issuing Books ---");
        library.issueBook(book1, member1); // Success
        library.issueBook(book1, member2); // Already issued

        System.out.println("\n--- Available Books After Issue ---");
        library.showAvailableBooks();

        System.out.println("\n--- Returning Books ---");
        library.returnBook(book1, member1); // Success
        library.returnBook(book2, member2); // Not borrowed

        System.out.println("\n--- Available Books After Return ---");
        library.showAvailableBooks();
    }
}
