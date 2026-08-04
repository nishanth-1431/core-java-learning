/* final Keyword Definition:

        The 'final' keyword is used to restrict modification
        in Java.

        The 'final' keyword can be used with:

        1. Variables
        2. Methods
        3. Classes

    final variable:
        Once a value is assigned, it cannot be reassigned.

    final method:
        A child class cannot override the method.

    final class:
        Another class cannot extend the final class.

    Syntax:

        final dataType variableName = value;

        final returnType methodName() {
            // code
        }

        final class ClassName {
            // code
        }

    Technical Explanation:

        final provides a restriction on modification or inheritance.

        final variable  → cannot be reassigned
        final method    → cannot be overridden
        final class     → cannot be inherited
*/

class Student {

    final int id = 101;

    void display() {

        System.out.println("Student ID: " + id);
    }
}

public class FinalVariable {

    public static void main(String[] args) {

        Student student = new Student();

        student.display();

        // Cannot change a final variable
        // student.id = 102; // ERROR
    }
}