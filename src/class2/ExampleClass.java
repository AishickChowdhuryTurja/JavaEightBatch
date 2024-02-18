package class2;


public class ExampleClass {
    private int number;

    // Constructor
    public ExampleClass(int number) {
        this.number = number;
    }

    // Method
    public void displayNumber() {
        System.out.println("The number is: " + number);
    }

    // Getter and Setter (optional)
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    // Main method (for testing)
    public static void main(String[] args) {
        // Creating an instance of ExampleClass using the constructor
        ExampleClass exampleObject = new ExampleClass(42);

        // Calling the method to display the number
        exampleObject.displayNumber();

        // Using the getter to retrieve the number
        int retrievedNumber = exampleObject.getNumber();
        System.out.println("Retrieved number using getter: " + retrievedNumber);

        // Using the setter to change the number
        exampleObject.setNumber(99);

        // Calling the method again to display the updated number
        exampleObject.displayNumber();
    }
}
