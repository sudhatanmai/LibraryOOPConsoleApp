import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        // Adding some books
        library.addBook(new Book(1, "Wings of Fire", "A.P.J. Abdul Kalam"));
        library.addBook(new Book(2, "The Alchemist", "Paulo Coelho"));
        library.addBook(new Book(3, "Harry Potter", "J.K. Rowling"));

        System.out.println("Welcome to the Library Management System");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Display all books");
            System.out.println("2. Issue a book");
            System.out.println("3. Return a book");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    library.displayAllBooks();
                    break;
                case 2:
                    System.out.print("Enter Book ID to issue: ");
                    int issueId = scanner.nextInt();
                    library.issueBook(issueId);
                    break;
                case 3:
                    System.out.print("Enter Book ID to return: ");
                    int returnId = scanner.nextInt();
                    library.returnBook(returnId);
                    break;
                case 4:
                    System.out.println("Thank you! Exiting the system.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
