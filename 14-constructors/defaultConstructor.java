/*  Default Constructor

    Definition:

        A default constructor is a constructor that Java provides
        automatically when a class does not contain any constructor.

        It is a no-argument constructor.

    Syntax:

        class ClassName {

            // No constructor is written
        }

        ClassName object = new ClassName();

    Technical Explanation:

        If we do not write any constructor inside a class, Java
        automatically provides a default constructor.

        This allows us to create an object using the new keyword.

        The default constructor does not initialize variables with
        values that we provide.

        Instead, instance variables receive their default values.

        For example:

            String → null
            int    → 0
            double → 0.0
            boolean → false

        Important:

        If we write any constructor ourselves, Java will no longer
        provide the default constructor automatically.
*/

class Student {

    String name;
    int age;
}

public class defaultConstructor {

    public static void main(String[] args) {

        // Creating a Student object
        // Java automatically provides the default constructor
        Student student = new Student();

        // Instance variables contain their default values
        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
    }
}