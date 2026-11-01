/*  Constructor Basics Definition:

        A constructor is a special part of a class that is
        automatically executed when an object is created.

        A constructor is mainly used to initialize the object
        with initial values.

    Syntax:
New file Java extension.scene. Hurry hurry hurry up
        class ClassName {

            ClassName() {
                // initialization
            }
        }

    Rules:

        1. The constructor name must be the same as the class name.
        2. A constructor does not have a return type.
        3. A constructor runs automatically when an object is created.

    Technical Explanation:

        When we create an object using the new keyword, Java
        automatically calls the constructor of that class.

        For example:

            Student student = new Student();

        Here, new Student() creates the object and automatically
        executes the Student() constructor.

        The constructor can initialize the instance variables
        of the newly created object.
*/

class Student {

    String name;
    int age;

    // Constructor
    Student() {
        name = "Nishanth";
        age = 19;
    }
}

public class constructorBasics {

    public static void main(String[] args) {

        // Creating a Student object
        Student student = new Student();

        // Constructor has initialized these values
        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
    }
}