
/*
Definition

Abstract Class vs Interface

Both abstract classes and interfaces are used to achieve
abstraction in Java.

Abstract Class:
1. Declared using the abstract keyword.
2. Can contain abstract and concrete methods.
3. Can have constructors.
4. Can have instance variables.
5. A class can extend only one abstract class.

Interface:
1. Declared using the interface keyword.
2. Contains abstract methods by default.
3. Variables are public static final by default.
4. Cannot have constructors.
5. A class can implement multiple interfaces.

Syntax:

abstract class Animal {
    abstract void sound();

    void eat() {
        System.out.println("Animal eats.");
    }
}

interface Flyable {
    void fly();
}

Example:
A Dog extends an abstract Animal class because a Dog is an Animal.

A Bird implements the Flyable interface because a Bird
has the ability to fly.
*/

abstract class Animal {

    abstract void sound();

    void eat() {
        System.out.println("Animal eats.");
    }
}

interface Flyable {

    void fly();
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}

class Bird extends Animal implements Flyable {

    @Override
    void sound() {
        System.out.println("Bird chirps.");
    }

    @Override
    public void fly() {
        System.out.println("Bird flies.");
    }
}

public class AbstractClassVsInterface {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.sound();
        dog.eat();

        Bird bird = new Bird();

        bird.sound();
        bird.eat();
        bird.fly();
    }
}
