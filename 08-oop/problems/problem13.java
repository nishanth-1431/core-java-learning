/*13. Default Access Modifier
Create two classes in the same package.
Create a field:
String city;
Access it from the second class.
Observe the result.
Topics Used:
- Default access modifier
- Packages
 */
class Student {

    // Default access modifier
    String city = "Coimbatore";
}

public class problem13 {

    public static void main(String[] args) {

        Student student = new Student();

        // Accessing the default variable
        System.out.println("City : " + student.city);
    }
}
