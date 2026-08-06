/*  Parameterized Constructor

    Definition:

        A parameterized constructor is a constructor that accepts
        parameters when an object is created.

        It is used to initialize an object with values provided
        during object creation.

    Syntax:

        class ClassName {

            ClassName(dataType variable) {
                // initialization
            }
        }

        ClassName object = new ClassName(value);

    Technical Explanation:

        A parameterized constructor allows different objects of
        the same class to be initialized with different values.

        The values are passed as arguments when the object is
        created.

        For example:

            Student student = new Student("Nishanth", 19);

        The values "Nishanth" and 19 are passed to the constructor.

        The constructor receives them through its parameters and
        assigns them to the object's instance variables.

        The this keyword refers to the current object.

            this.name = name;

        Here:

            this.name → instance variable
            name      → constructor parameter
*/

class Student {

    String name;
    int age;

    // Parameterized constructor
    Student(String name, int age) {

        // Assigning parameter values to instance variables
        this.name = name;
        this.age = age;
    }
}

public class parameterizedConstructor {

    public static void main(String[] args) {

        // Creating objects with different values
        Student student1 = new Student("Nishanth", 19);
        Student student2 = new Student("Rahul", 20);

        // Displaying student details
        System.out.println("Student 1");
        System.out.println("Name: " + student1.name);
        System.out.println("Age: " + student1.age);

        System.out.println();

        System.out.println("Student 2");
        System.out.println("Name: " + student2.name);
        System.out.println("Age: " + student2.age);
    }
}