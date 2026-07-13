/*11. Public Variable
Create a Person class.
Create a field:
public String name;
Access the variable directly from another class.
Topics Used:
- public access modifier
 */

class Person {

    // Public field
    public String name;
}

public class problem11 {
    public static void main(String[] args) {

        // Creating Person object
        Person person = new Person();

        // Accessing public variable directly
        person.name = "Nishanth";

        // Displaying the value
        System.out.println("Name : " + person.name);
    }
}
