package class3;

// Class definition
class Book {
    // Fields or attributes
    String title;
    String author;
    int pages;

    // Default constructor
    public Book() {
        // Default values
        title = "Unknown Title";
        author = "Unknown Author";
        pages = 0;
    }

    // Parameterized constructor
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    // Method to display information about the book
    public void displayBookInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Number of Pages: " + pages);
    }
}

// Main class
public class ConstructorsWithTwoObjectsExample {
    public static void main(String[] args) {
        // Creating objects (instances) of the Book class using both constructors
        Book defaultBook = new Book(); // Default constructor
        Book paramBook = new Book("Java Programming", "John Smith", 400); // Parameterized constructor

        // Displaying information about the books
        System.out.println("Details of Default Book:");
        defaultBook.displayBookInfo();
        System.out.println();

        System.out.println("Details of Parameterized Book:");
        paramBook.displayBookInfo();
    }
}
