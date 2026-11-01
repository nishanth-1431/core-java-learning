/* Setters Definition:

        A setter is a public method used to update the value of
        a private variable from outside the class.

        Since a private variable cannot be directly modified
        outside its class, a setter provides controlled access
        to change its value.

    Syntax:

        public void setVariableName(dataType newValue) {
            variableName = newValue;
        }

    Technical Explanation:

        A setter receives a value as a parameter and assigns
        that value to the private variable.

        Setter → Modify private data
*/

class Student {

    private String name;

    // Setter method used to update the private name
    public void setName(String newName) {
        name = newName;
    }

    // Getter method used to read the private name
    public String getName() {
        return name;
    }
}

public class SetterExample {

    public static void main(String[] args) {

        Student student = new Student();

        // Updating the private variable using the setter
        student.setName("Nishanth");

        // Reading the updated value using the getter
        System.out.println("Student: " + student.getName());
    }
}