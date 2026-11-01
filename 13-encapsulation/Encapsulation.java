/*  Encapsulation

    Definition:

        Encapsulation is the process of wrapping data (variables)
        and the methods that operate on that data into a single unit,
        usually a class.

        Encapsulation also allows us to control how the data can
        be accessed and modified.

        One common way to achieve encapsulation is by making
        variables private.

    Syntax:

        class ClassName {
            private dataType variable;

            public returnType method() {
                return variable;
            }
        }

    Technical Explanation:

        A private variable can only be directly accessed inside
        the class where it is declared.

        Code outside the class cannot directly access a private
        variable.

        This protects the data from uncontrolled access or
        modification.

        Later, getters and setters can be used to provide
        controlled access to private variables.
*/

class Student {

    // Private variable cannot be directly accessed outside Student
    private String name;

    // Method inside the class can access the private variable
    void displayName() {
        System.out.println("Student: " + name);
    }

    // Method inside the class can modify the private variable
    void setName() {
        name = "Nishanth";
    }
}

public class Encapsulation {

    public static void main(String[] args) {

        // Creating a Student object
        Student student = new Student();

        // Modifying the private variable through a class method
        student.setName();

        // Accessing the private variable through a class method
        student.displayName();
    }
}