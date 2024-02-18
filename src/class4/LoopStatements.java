package class4;

public class LoopStatements {


    public static void main(String[] args) {
        // Do-while loop
        int i = 1;
        do {
            System.out.println("Do-while loop iteration " + i);
            i++;
        } while (i <= 5);

        System.out.println(); // Separating different loops' output

        // While loop
        int j = 1;
        while (j <= 5) {
            System.out.println("While loop iteration " + j);
            j++;
        }

        System.out.println(); // Separating different loops' output

        // For loop
        for (int k = 1; k <= 5; k++) {
            System.out.println("For loop iteration " + k);
        }

        System.out.println(); // Separating different loops' output

        // For-each loop (used with an array)
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println("For-each loop iteration " + number);
        }
    }
}

