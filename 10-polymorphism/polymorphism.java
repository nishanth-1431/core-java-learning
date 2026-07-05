/* POLYMORPHISM :
     - Polymorphism means: "One thing having many forms"
       Poly = Many Morph = Forms

  - Real-Life Example
    A person can behave differently:
    At home → Son/Daughter
    In school → Student
    In office → Employee
    Same person, different behaviors.
    This concept is called Polymorphism

    Why Do We Use Polymorphism?

    Advantages of Polymorphism
        Code Reusability
        Flexibility
        Easy Maintenance
        Reduces Duplicate Code
        Improves Readability

    Practical Explanation
        Instead of creating many different method names,
        we can use the same method name for different operations.
        Example:
        add(10,20) & add(10,20,30)
        Same method name → Different behavior
    
    Two Types of Polymorphism

        1. Compile-time Polymorphism
        Also called Static Polymorphism
        Achieved using Method Overloading
        Decision made during compilation

        2. Runtime Polymorphism
        Also called Dynamic Polymorphism
        Achieved using Method Overriding
        Decision made during execution


 */
class Animal {

    // Parent class
    void sound() {
        System.out.println("Animal");
    }
}

class Dog extends Animal {

    // Dog has its own sound
    void sound() {
        System.out.println("Dog");
    }
}

public class polymorphism {

    public static void main(String[] args) {

        // Parent reference storing a Dog object
        Animal a = new Dog();

        // Java checks the object (Dog) and prints Dog
        a.sound();
    }
}
