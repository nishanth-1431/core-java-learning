/* 2. Runtime Polymorphism :
      - Definition
        When the method call is decided during program execution (runtime),
        it is called Runtime Polymorphism.

      - Achieved By
        Method Overriding

      - Key Point
        Same method name, same parameters,
        but different implementation in the child class.

    What is Method Overriding?
        - Definition
            When a child class provides its own implementation
            of a method that already exists in the parent class,
            it is called Method Overriding.

        - Rules
            Parent and child class must have inheritance.
            Method name must be the same.
            Parameters must be the same.
            Return type should be the same (or compatible).
            Access modifier cannot be more restrictive.
*/

class Animal {

    // Parent class method
    void sound() {
        System.out.println("Animals make different sounds.");
    }
}

// Child Class 1
class Dog extends Animal {

    // Overriding the parent method
    @Override
    void sound() {
        System.out.println("Dog says: Bark");
    }
}

// Child Class 2
class Cat extends Animal {

    // Overriding the parent method
    @Override
    void sound() {
        System.out.println("Cat says: Meow");
    }
}

// Child Class 3
class Cow extends Animal {

    // Overriding the parent method
    @Override
    void sound() {
        System.out.println("Cow says: Moo");
    }
}

public class runtime_polymorphism {

    public static void main(String[] args) {

        // Parent reference pointing to Dog object
        Animal obj = new Dog();

        // At runtime, Java calls Dog's sound()
        obj.sound();

        // Parent reference pointing to Cat object
        obj = new Cat();

        // At runtime, Java calls Cat's sound()
        obj.sound();

        // Parent reference pointing to Cow object
        obj = new Cow();

        // At runtime, Java calls Cow's sound()
        obj.sound();
    }
}

/*
Output:
Dog says: Bark
Cat says: Meow
Cow says: Moo

----------------------------------------------------
Explanation:

Animal obj = new Dog();

Reference Type : Animal
Object Type    : Dog

Compile Time:
Java checks whether Animal has a sound() method.
Yes → Compilation succeeds.

Runtime:
Java checks which object is actually created.
Object = Dog
So Dog's sound() method is executed.

This is called Runtime Polymorphism.

----------------------------------------------------
Real Time Example:

Payment System

Payment payment;

payment = new UPI();
payment.pay();

payment = new CreditCard();
payment.pay();

payment = new NetBanking();
payment.pay();

Same method:
pay()

Different behavior:
UPI -> Pays using UPI
Credit Card -> Pays using Card
Net Banking -> Pays using Bank

----------------------------------------------------
Another Real Time Example:

Notification System

notify()

Email -> Sends Email
SMS -> Sends SMS
WhatsApp -> Sends WhatsApp Message

Same method
Different implementation.
*/