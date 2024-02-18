package class4;

public class DecisionMakingStatements {


    public static void main(String[] args) {
        int number = 10;

        // Simple if statement
        if (number > 0) {
            System.out.println("The number is positive.");
        }

        // If-else statement
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        // If-else-if ladder
        int grade = 85;
        if (grade >= 90) {
            System.out.println("Grade A");
        } else if (grade >= 80) {
            System.out.println("Grade B");
        } else if (grade >= 70) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade D");
        }

        // Nested if statement
        int x = 5;
        int y = 10;
        if (x > 0) {
            if (y > 0) {
                System.out.println("Both x and y are positive.");
            } else {
                System.out.println("Only x is positive.");
            }
        } else {
            System.out.println("Neither x nor y is positive.");
        }
    }
}

