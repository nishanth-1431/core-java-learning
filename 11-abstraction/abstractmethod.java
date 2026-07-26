/*
    Abstract Method

    An abstract method is a method that has only a declaration
    and no implementation (no method body).

    Rules:
    - An abstract method must be declared inside an abstract class.
    - Child classes must provide the implementation of the abstract method.
    - An abstract class cannot be instantiated (its object cannot be created).

    Syntax:
        abstract returnType methodName();

    Example:
        abstract void sound();
*/
abstract class Animal {

    // Abstract method (no body)
    abstract void sound();
}

class Dog extends Animal {

    // Providing implementation of the abstract method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class abstractmethod {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.sound();
    }
}