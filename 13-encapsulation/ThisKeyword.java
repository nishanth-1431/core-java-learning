/* this Keyword Definition:

        The 'this' keyword refers to the current object.

        It is commonly used when a class field and a method
        parameter have the same name.

        Syntax:

        this.variable = variable;

        Technical Explanation:

        'this.variable' refers to the current object's field.

        The variable without 'this' refers to the local variable
        or method parameter.

    Example:

        class Student {

            String name;

            void setName(String name) {
                this.name = name;
            }
        }

    Here:

        this.name → object's field
        name      → method parameter
*/

class Student {

    String name;

    // 'this.name' refers to the object's name field
    // 'name' refers to the method parameter
    void setName(String name) {
        this.name = name;
    }
    void displayName() {
        System.out.println("Student: " + name);
    }
}

public class ThisKeyword {

    public static void main(String[] args) {

        Student student = new Student();

        // Passing a value to the method
        student.setName("Nishanth");

        // Displaying the object's name
        student.displayName();
    }
}