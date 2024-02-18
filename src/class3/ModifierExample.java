package class3;

// Public class with default access modifier
class DefaultAccessClass {
    void display() {
        System.out.println("Default access class");
    }
}

// Public class with public access modifier
public class ModifierExample {
    // Constant with final and public modifiers
    public static final int MAX_VALUE = 100;

    // Static variable with private access modifier
    private static int count = 0;

    // Method with public access modifier
    public static void incrementCount() {
        count++;
    }

    // Method with private access modifier
    private static void displayCount() {
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        // Creating an instance of DefaultAccessClass
        DefaultAccessClass defaultAccessObj = new DefaultAccessClass();
        defaultAccessObj.display();

        // Accessing constant with public modifier
        System.out.println("Max Value: " + MAX_VALUE);

        // Accessing static variable and methods with private and public modifiers
        incrementCount();
        incrementCount();
        displayCount();
    }
}

