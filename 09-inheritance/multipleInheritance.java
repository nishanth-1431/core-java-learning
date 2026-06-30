/*
What is Multilevel Inheritance?

Multilevel Inheritance is a type of inheritance where one class
inherits another class, and that child class becomes the parent
for another class.

Syntax:

class A {
}

class B extends A {
}

class C extends B {
}
*/

class Dog {

    // Field of Dog class
    String dog;

    // Displays the sound of a dog
    void sound() {
        System.out.println("Woof Woof !!");
    }
}

/*
Cat inherits all the properties and methods of Dog.
*/
class Cat extends Dog {

    // Field of Cat class
    String cat;

    // Method overriding
    void sound() {
        System.out.println("Meoww Meoww !!");
    }
}

/*
Tiger inherits all the properties and methods of Cat.
Since Cat already inherits Dog,
Tiger can also access Dog's members.
*/
class Tiger extends Cat {

    // Field of Tiger class
    String tiger;

    // Method overriding
    void sound() {
        System.out.println("Roarr !!");
    }
}

public class multipleInheritance {

    // Program execution starts here
    public static void main(String[] args) {

        // Creating an object of the last child class
        Tiger t = new Tiger();

        // Calls Tiger's sound() method
        t.sound();
    }
}

/*
Inheritance Hierarchy

Dog
  |
  | extends
  v
Cat
  |
  | extends
  v
Tiger

Object Created:
Tiger t = new Tiger();

Method Call:
t.sound();

Output:
Roarr !!

Note:
Even though Tiger inherits Dog and Cat,
the sound() method is overridden in every class.
Therefore, the Tiger class method is executed.
*/