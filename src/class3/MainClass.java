package class3;

// MainClass.java in the package class3


public class MainClass {
    public static void main(String[] args) {
        System.out.println("This is the main class in the class3 package.");

        // Creating an instance of HelperClass from the same package
        HelperClass helper = new HelperClass();
        helper.displayMessage();
    }
}
