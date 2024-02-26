package class4;

public class JumpStatements {

    public static void main(String[] args) {
        // Example of break statement
        System.out.println("Example of break statement:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Breaking the loop at i = 3");
                break;
            }
            System.out.println("Loop iteration: " + i);
        }

        System.out.println();

        // Example of continue statement
        System.out.println("Example of continue statement:");
        for (int j = 1; j <= 5; j++) {
            if (j == 2 || j == 4) {
                System.out.println("Skipping the loop iteration at j = " + j);
                continue;
            }
            System.out.println("Loop iteration: " + j);
        }
    }
}
