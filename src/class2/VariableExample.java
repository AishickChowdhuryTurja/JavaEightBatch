package class2;


import java.util.Arrays;

public class VariableExample {

    public static void main(String[] args) {
        // Primitive Data Types
        byte byteVar = 127;             // 8-bit signed integer
        short shortVar = 32767;         // 16-bit signed integer
        int intVar = 2147483647;        // 32-bit signed integer
        long longVar = 9223372036854775807L; // 64-bit signed integer

        float floatVar = 3.14f;         // 32-bit floating-point
        double doubleVar = 3.14159265359; // 64-bit floating-point

        char charVar = 'A';             // 16-bit Unicode character
        boolean booleanVar = true;      // true or false

        // Reference Data Types
        String stringVar = "Hello, Java!"; // String is a class in Java

        // Arrays
        int[] intArray = {1, 2, 3, 4, 5};
        char[] charArray = {'A', 'B', 'C'};

        // Custom Objects
        Person person = new Person("John", 25);

        // Output
        System.out.println("byteVar: " + byteVar);
        System.out.println("shortVar: " + shortVar);
        System.out.println("intVar: " + intVar);
        System.out.println("longVar: " + longVar);
        System.out.println("floatVar: " + floatVar);
        System.out.println("doubleVar: " + doubleVar);
        System.out.println("charVar: " + charVar);
        System.out.println("booleanVar: " + booleanVar);
        System.out.println("stringVar: " + stringVar);
        System.out.println("intArray: " + Arrays.toString(intArray));
        System.out.println("charArray: " + Arrays.toString(charArray));
        System.out.println("Person: " + person.toString());
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}
