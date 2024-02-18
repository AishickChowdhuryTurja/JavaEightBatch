package class2;

public class PrimitiveDataTypesExample {

        // Integral types
        byte byteVariable = 127;
        short shortVariable = 32767;
        int intVariable = 2147483647;
        long longVariable = 9223372036854775807L;

        // Floating-point types
        float floatVariable = 3.14f;
        double doubleVariable = 3.141592653589793;

        // Boolean type
        boolean booleanVariable = true;

        // Character type
        char charVariable = 'A';

        public static void main(String[] args) {
            PrimitiveDataTypesExample example = new PrimitiveDataTypesExample();
            example.printValues();
        }

        public void printValues() {
            System.out.println("byteVariable: " + byteVariable);
            System.out.println("shortVariable: " + shortVariable);
            System.out.println("intVariable: " + intVariable);
            System.out.println("longVariable: " + longVariable);
            System.out.println("floatVariable: " + floatVariable);
            System.out.println("doubleVariable: " + doubleVariable);
            System.out.println("booleanVariable: " + booleanVariable);
            System.out.println("charVariable: " + charVariable);
        }
    }
