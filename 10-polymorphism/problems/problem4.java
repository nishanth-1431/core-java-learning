/*  Problem 4 – Greeting Application (Method Overloading)
Create a Greeting class and overload the greet() method to:
•	Display a general greeting
•	Greet a person using their name
•	Greet a person using their name and city
*/
public class problem4 {

    // General greeting
    void greet() {
        System.out.println("Hello! Welcome!");
    }

    // Greeting with name
    void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Greeting with name and city
    void greet(String name, String city) {
        System.out.println("Hello, " + name + " from " + city + "!");
    }

    public static void main(String[] args) {

        problem4 g = new problem4();

        g.greet();
        g.greet("Nishanth");
        g.greet("Nishanth", "Coimbatore");
    }
}