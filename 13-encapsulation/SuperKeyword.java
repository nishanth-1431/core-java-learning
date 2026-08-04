/*
    Topic 13 - Encapsulation
    Topic 5 - super Keyword

    Definition:

    The 'super' keyword refers to the immediate parent class
    of the current object.

    It is mainly used to access members of the parent class.

    Syntax:

    super.variable;
    super.method();

    Technical Explanation:

    When a child class has a variable or method with the same
    name as the parent class, 'super' can be used to specifically
    access the parent class member.

    'this' refers to the current class object.

    'super' refers to the parent class.

    Example:

    Parent
       ↑
    Child

    this  → current class
    super → parent class
*/

class Animal {

    String name = "Animal";

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    String name = "Dog";

    void display() {

        // Accessing the current class variable
        System.out.println("Child: " + this.name);

        // Accessing the parent class variable
        System.out.println("Parent: " + super.name);

        // Calling the parent class method
        super.sound();
    }
}

public class SuperKeyword {

    public static void main(String[] args) {

        // Creating a Dog object
        Dog dog = new Dog();

        // Calling the method
        dog.display();
    }
}