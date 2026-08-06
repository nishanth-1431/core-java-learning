/*  Constructor Overloading

    Definition:

        Constructor overloading is the process of creating
        multiple constructors in the same class with different
        parameter lists.

        Each constructor performs object initialization in a
        different way.

    Syntax:

        class ClassName {

            ClassName() {
            }

            ClassName(dataType value) {
            }

            ClassName(dataType value1, dataType value2) {
            }
        }

    Technical Explanation:

        A class can contain multiple constructors as long as
        their parameter lists are different.

        Java determines which constructor to execute based on
        the number, type, and order of the arguments passed
        while creating the object.

        This allows objects to be initialized in different
        ways without creating multiple classes.
*/

class Student {

    String name;
    int age;

    // Constructor 1
    Student() {
        System.out.println("Default Constructor");
    }

    // Constructor 2
    Student(String name) {
        this.name = name;
        System.out.println("Name Constructor : "+name);
    }

    // Constructor 3
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Name and Age Constructor : "+name+" , "+age);
    }
}

public class constructorOverloading {

    public static void main(String[] args) {

        Student student1 = new Student();

        Student student2 = new Student("Nishanth");

        Student student3 = new Student("Rahul", 20);
    }
}