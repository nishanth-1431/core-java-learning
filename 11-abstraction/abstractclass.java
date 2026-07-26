/*
    Abstract Class

    An abstract class is a class that cannot be instantiated
    (its object cannot be created directly).

    It is used as a blueprint for other classes.

    An abstract class can contain:
    - Variables
    - Constructors
    - Normal (concrete) methods
    - Abstract methods

    It is declared using the 'abstract' keyword.

    Syntax:
        abstract class ClassName {
            // Members
        }
*/
abstract class Animal {

    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {

}

public class abstractclass {
    public static void main(String[] args) {

        // Animal a = new Animal(); // Not allowed

        Dog dog = new Dog();
        dog.eat();
    }
}