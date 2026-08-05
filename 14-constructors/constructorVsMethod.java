/*  Constructor vs Method

    Definition:

        A constructor and a method are both blocks of code inside
        a class, but they have different purposes.

        A constructor is mainly used to initialize an object and
        runs automatically when the object is created.

        A method is used to perform an operation or behavior and
        must be called when we want it to execute.

    Syntax:

        Constructor:

            class ClassName {

                ClassName() {
                    // initialization
                }
            }

        Method:

            class ClassName {

                void methodName() {
                    // operation
                }
            }

    Differences:

        Constructor:
            1. Must have the same name as the class.
            2. Does not have a return type.
            3. Runs automatically when an object is created.
            4. Mainly used to initialize object values.

        Method:
            1. Can have any valid name.
            2. Has a return type or void.
            3. Must normally be called explicitly.
            4. Used to perform an operation or behavior.

    Technical Explanation:

        When an object is created using the new keyword, Java
        automatically executes the constructor.

            Student student = new Student();

        The Student() constructor initializes the object.

        A method does not execute automatically when an object
        is created.

        It must be called using the object.

            student.displayDetails();

        A constructor cannot be called like a normal method.

        For example:

            student.Student();    // Invalid

        Also, if a class contains:

            void Student() {
            }

        it is a method, not a constructor, because it has a
        return type of void.
*/

class Student {

    String name;
    int age;

    // Constructor automatically runs when the object is created
    Student() {
        name = "Nishanth";
        age = 19;
    }

    // Method must be called explicitly
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class constructorVsMethod {

    public static void main(String[] args) {

        // Creating a Student object
        // Constructor automatically runs here
        Student student = new Student();

        // Calling the method explicitly
        student.displayDetails();
    }
}