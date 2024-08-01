import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Library {
    private String[] books;
    private boolean[] availability;
    private ArrayList<String> bookName;
    private Map<String, String> issuedBooks; 

    public Library(int capacity) {
        books = new String[capacity];
        availability = new boolean[capacity];
        Arrays.fill(availability, true);
        bookName = new ArrayList<>(capacity);
        issuedBooks = new HashMap<>();
    }

    public void addBook(String bookTitle) {
        if (bookTitle == null || bookTitle.trim().isEmpty()) {
            System.out.println("Invalid book title.");
            return;
        }
        if (bookName.contains(bookTitle)) {
            System.out.println("Book already exists in the library.");
            return;
        }
        bookName.add(bookTitle);
        availability[bookName.indexOf(bookTitle)] = true;
        System.out.println("Book added successfully");
    }

    public void removeBook(String bookTitle) {
        if (bookTitle == null || bookTitle.trim().isEmpty()) {
            System.out.println("Invalid book title.");
            return;
        }
        int index = bookName.indexOf(bookTitle);
        if (index != -1) {
            bookName.remove(index);
            availability[index] = true; 
            issuedBooks.remove(bookTitle);
            System.out.println("Book removed successfully");
        } else {
            System.out.println("Book not found in the library");
        }
    }

    public void findBook(String bookTitle) {
        if (bookTitle == null || bookTitle.trim().isEmpty()) {
            System.out.println("Invalid book title.");
            return;
        }
        if (bookName.contains(bookTitle)) {
            System.out.println("Book found successfully");
        } else {
            System.out.println("Book not found in the library");
        }
    }

    public void issueBook(String bookTitle, String userName) {
        if (bookTitle == null || bookTitle.trim().isEmpty() || userName == null || userName.trim().isEmpty()) {
            System.out.println("Invalid book title or user name.");
            return;
        }
        int index = bookName.indexOf(bookTitle);
        if (index == -1) {
            System.out.println("Book not found in the library");
            return;
        }
        if (availability[index]) {
            availability[index] = false;
            String issuedDateTime = new SimpleDateFormat("dd-MM-yyyy HH:mm: a").format(new Date());
            issuedBooks.put(bookTitle, userName + ", " + issuedDateTime);
            System.out.println("Book issued successfully: " + bookTitle);
        } else {
            System.out.println("Book is already issued");
        }
    }

    public void returnBook(String bookTitle) {
        if (bookTitle == null || bookTitle.trim().isEmpty()) {
            System.out.println("Invalid book title.");
            return;
        }
        int index = bookName.indexOf(bookTitle);
        if (index == -1) {
            System.out.println("Book not found in the library");
            return;
        }
        if (!availability[index]) {
            availability[index] = true;
            issuedBooks.remove(bookTitle);
            System.out.println("Book returned successfully: " + bookTitle);
        } else {
            System.out.println("This book is already in the library");
        }
    }

    public void displayAvailableBooks() {
        System.out.println("Available Books:");
        boolean hasAvailableBooks = false;
        for (int i = 0; i < bookName.size(); i++) {
            if (availability[i]) {
                System.out.println(bookName.get(i));
                hasAvailableBooks = true;
            }
        }
        if (!hasAvailableBooks) {
            System.out.println("No books are currently available.");
        }
    }

    public void displayIssuedBooks() {
        System.out.println("Issued Books:");
        if (issuedBooks.isEmpty()) {
            System.out.println("No books are currently issued.");
            return;
        }
        for (Map.Entry<String, String> entry : issuedBooks.entrySet()) {
            System.out.println("Book: " + entry.getKey() + ", Issued To: " + entry.getValue());
        }
    }

    public void displayAllBooks() {
        System.out.println("All Books:");
        if (bookName.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }
        for (String book : bookName) {
            String status = availability[bookName.indexOf(book)] ? "Available" : "Issued";
            System.out.println(book + " (" + status + ")");
        }
    }

    public static void main(String[] args) {
        Library library = new Library(20);
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("\nWhat do you want to do?");
                System.out.println("1. Add book");
                System.out.println("2. Remove book");
                System.out.println("3. Find book");
                System.out.println("4. Issue book");
                System.out.println("5. Return book");
                System.out.println("6. Show issued books");
                System.out.println("7. Show available books");
                System.out.println("8. Show all books");
                System.out.println("9. Exit");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter book name to add: ");
                        String addBookTitle = sc.nextLine();
                        library.addBook(addBookTitle);
                        break;
                    case 2:
                        System.out.print("Enter book name to remove: ");
                        String removeBookTitle = sc.nextLine();
                        library.removeBook(removeBookTitle);
                        break;
                    case 3:
                        System.out.print("Enter book name to find: ");
                        String findBookTitle = sc.nextLine();
                        library.findBook(findBookTitle);
                        break;
                    case 4:
                        System.out.print("Enter the title of the book to issue: ");
                        String issueBookTitle = sc.nextLine();
                        System.out.print("Enter the name of the person issuing the book: ");
                        String userName = sc.nextLine();
                        library.issueBook(issueBookTitle, userName);
                        break;
                    case 5:
                        System.out.print("Enter the title of the book to return: ");
                        String returnBookTitle = sc.nextLine();
                        library.returnBook(returnBookTitle);
                        break;
                    case 6:
                        library.displayIssuedBooks();
                        break;
                    case 7:
                        library.displayAvailableBooks();
                        break;
                    case 8:
                        library.displayAllBooks();
                        break;
                    case 9:
                        System.out.println("Exiting the program.");
                        sc.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 9.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                sc.next();
            } catch (NoSuchElementException e) {
                System.out.println("Unexpected end of input.");
                break;
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }
    }
}
