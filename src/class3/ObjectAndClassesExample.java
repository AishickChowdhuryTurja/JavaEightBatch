package class3;

// Class definition
class Student {
    // Fields or attributes
    String name;
    int age;
    String course;

    // Constructor (a special method to initialize objects)
    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Method to display information about the student
    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Course: " + course);
    }
}

// Main class
public class ObjectAndClassesExample {
    public static void main(String[] args) {
        // Creating objects (instances) of the Student class
        Student student1 = new Student("John Doe", 20, "Computer Science");
        Student student2 = new Student("Jane Smith", 22, "Mathematics");

        // Accessing fields and methods of the objects
        System.out.println("Details of Student 1:");
        student1.displayStudentInfo();
        System.out.println();

        System.out.println("Details of Student 2:");
        student2.displayStudentInfo();
    }
}
