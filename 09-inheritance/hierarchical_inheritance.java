/*
What is Hierarchical Inheritance?

Hierarchical Inheritance is a type of inheritance where
multiple child classes inherit from the same parent class.

Syntax:

class Parent {
}

class Child1 extends Parent {
}

class Child2 extends Parent {
}

class Child3 extends Parent {
}
*/

class Animal {

    // Field of Parent class
    String name;

    // Method of Parent class
    void eat() {
        System.out.println("Animal is Eating.");
    }
}

/*
Dog inherits the Animal class.
*/
class Dog extends Animal {

    // Field of Dog class
    String breed;

    // Method of Dog class
    void bark() {
        System.out.println("Dog is Barking.");
    }
}

/*
Cat also inherits the Animal class.
*/
class Cat extends Animal {

    // Field of Cat class
    String color;

    // Method of Cat class
    void meow() {
        System.out.println("Cat is Meowing.");
    }
}

/*
Tiger also inherits the Animal class.
*/
class Tiger extends Animal {

    // Field of Tiger class
    String forest;

    // Method of Tiger class
    void roar() {
        System.out.println("Tiger is Roaring.");
    }
}

public class hierarchical_inheritance {

    // Program execution starts here
    public static void main(String[] args) {

        // Creating objects of all child classes

        Dog d = new Dog();
        Cat c = new Cat();
        Tiger t = new Tiger();

        // Dog object
        d.eat();      // Inherited from Animal
        d.bark();     // Dog class method

        // Cat object
        c.eat();      // Inherited from Animal
        c.meow();     // Cat class method

        // Tiger object
        t.eat();      // Inherited from Animal
        t.roar();     // Tiger class method
    }
}

/*
Inheritance Hierarchy

            Animal
          /    |    \
         /     |     \
      Dog     Cat   Tiger

Objects Created:
Dog d = new Dog();
Cat c = new Cat();
Tiger t = new Tiger();

Method Calls:
d.eat();
d.bark();

c.eat();
c.meow();

t.eat();
t.roar();

Output:
Animal is Eating.
Dog is Barking.
Animal is Eating.
Cat is Meowing.
Animal is Eating.
Tiger is Roaring.

Note:
All child classes inherit the eat() method from Animal.
Each child class has its own unique method.
*/