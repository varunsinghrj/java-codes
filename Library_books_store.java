import java.util.Arrays;
import java.util.Scanner;

class Library {
    private String[] books;
    private boolean[] availability;

    public Library(int capacity) {
        books = new String[capacity];
        availability = new boolean[capacity];
        Arrays.fill(availability, true);
    }
    public void addBook(String bookTitle) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = bookTitle;
                availability[i] = true;
                System.out.println("Book added successfully: " + bookTitle);
                return;
            }
        }
        System.out.println("Library is full. Cannot add more books.");
    }
    public void displayAvailableBooks() {
        System.out.println("Available Books:");
        boolean empty = true;
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && availability[i]) {
                System.out.println(books[i]);
                empty = false;
            }
        }
        if (empty) {
            System.out.println("No books available currently.");
        }
    }
    public void issueBook(String bookTitle) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].equalsIgnoreCase(bookTitle)) {
                if (availability[i]) {
                    availability[i] = false;
                    System.out.println("Book issued successfully: " + bookTitle);
                    return;
                } else {
                    System.out.println("Book is already issued.");
                    return;
                }
            }
        }
        System.out.println("Book not found in the library.");
    }
    public void returnBook(String bookTitle) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].equalsIgnoreCase(bookTitle)) {
                if (!availability[i]) {
                    availability[i] = true;
                    System.out.println("Book returned successfully: " + bookTitle);
                    return;
                } else {
                    System.out.println("This book is already in the library.");
                    return;
                }
            }
        }
        System.out.println("Book not found in the library.");
    }
}

public class Library_books_store {
    public static void main(String[] args) {
        Library library = new Library(20);

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nLibrary Management System Menu:");
            System.out.println("1. Add a book");
            System.out.println("2. Display available books");
            System.out.println("3. Issue a book");
            System.out.println("4. Return a book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the title of the book to add: ");
                    String bookTitle = scanner.nextLine();
                    library.addBook(bookTitle);
                    break;
                case 2:
                    library.displayAvailableBooks();
                    break;
                case 3:
                    System.out.print("Enter the title of the book to issue: ");
                    bookTitle = scanner.nextLine();
                    library.issueBook(bookTitle);
                    break;
                case 4:
                    System.out.print("Enter the title of the book to return: ");
                    bookTitle = scanner.nextLine();
                    library.returnBook(bookTitle);
                    break;
                case 5:
                    System.out.println("Exiting Library Management System. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid choice.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
