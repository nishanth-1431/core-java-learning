/* Getters Definition:

        A getter is a public method used to read the value of
        a private variable from outside the class.

        Since a private variable cannot be accessed directly
        outside its class, a getter provides controlled access
        to read its value.

    Syntax:

        public dataType getVariableName() {
            return variableName;
        }

    Example:

        private String name;

        public String getName() {
            return name;
        }

    Technical Explanation:

        The getter does not create a new value.

        It returns the current value stored in the private
        variable.

        Getter → Read private data
*/

class Student {

    private String name;

    // Getter method used to read the private name
    public String getName() {
        return name;
    }

    // Method used to assign a value for this example
    public void setName() {
        name = "Nishanth";
    }
}

public class GetterExample {

    public static void main(String[] args) {

        Student student = new Student();

        // Assigning a value through a class method
        student.setName();

        // Reading the private variable using the getter
        System.out.println("Student: " + student.getName());
    }
}