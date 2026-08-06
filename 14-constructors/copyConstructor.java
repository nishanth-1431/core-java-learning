/*  Copy Constructor

    Definition:

        A copy constructor is a constructor that creates a new
        object by copying the values from another object of the
        same class.

        Java does not provide a copy constructor automatically.
        We create it ourselves.

    Syntax:

        class ClassName {

            ClassName(ClassName object) {

            }
        }

    Technical Explanation:

        A copy constructor receives an object of the same class
        as its parameter.

        It copies the instance variable values from the existing
        object to the newly created object.

        This creates a new object with the same data as the
        original object.

        Both objects are different objects in memory, but their
        values are the same.
*/

class Student {

    String name;
    int age;

    // Parameterized constructor
    Student(String name, int age) {

        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Student(Student other) {

        this.name = other.name;
        this.age = other.age;
    }
}

public class copyConstructor {

    public static void main(String[] args) {

        // Original object
        Student student1 = new Student("Nishanth", 19);

        // Copying student1 into student2
        Student student2 = new Student(student1);

        System.out.println("Student 1");
        System.out.println("Name: " + student1.name);
        System.out.println("Age: " + student1.age);

        System.out.println();

        System.out.println("Student 2");
        System.out.println("Name: " + student2.name);
        System.out.println("Age: " + student2.age);
    }
}