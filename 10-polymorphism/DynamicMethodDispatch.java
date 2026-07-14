/*
What is Dynamic Method Dispatch?

Dynamic Method Dispatch is a mechanism in Java where the
method to be executed is decided at Runtime instead of
Compile Time.

It is also known as:
- Runtime Method Dispatch
- Dynamic Binding
- Late Binding

Dynamic Method Dispatch is achieved using:
- Inheritance
- Method Overriding
- Upcasting

How does it work?

1. A Parent class reference stores a Child class object.
2. The Child class overrides the Parent class method.
3. When the method is called, Java checks the actual object
   at Runtime and executes the Child's overridden method.

Syntax

    Parent reference = new Child();
    reference.method();

*/

class Animal {

    void sound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}

public class DynamicMethodDispatch {

    public static void main(String[] args) {

        // Upcasting
        Animal a = new Dog();

        // Dynamic Method Dispatch
        a.sound();

    }
}