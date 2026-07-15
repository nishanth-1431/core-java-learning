/*12. Private Variable
Create a Person class.
Create a field:
private int age;
Try accessing it directly from another class and observe the compiler error.
Then create:
- setAge()
- getAge()
Use these methods to access the private variable.
Topics Used:
- private access modifier
- Getter and Setter methods
 */
class Person {

    // Private variable
    private int age;

    // Setter method
    void setAge(int age) {
        this.age = age;
    }

    // Getter method
    int getAge() {
        return age;
    }
}

public class problem12 {

    public static void main(String[] args) {

        Person person = new Person();

        // Compiler Error
        // person.age = 19;

        // Using Setter
        person.setAge(19);

        // Using Getter
        System.out.println("Age : " + person.getAge());
    }
}
