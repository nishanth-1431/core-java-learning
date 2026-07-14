/*
    What is Upcasting?
        Upcasting is the process of converting a Child class object into a Parent class reference.

      - Happens automatically.
      - No explicit cast is required.
      - Used to achieve Runtime Polymorphism.
      - The parent reference can access only the methods and variables available in the parent class.
      - If a method is overridden, Java calls the child class method at runtime (Dynamic Method Dispatch).

    Syntax
        Parent reference = new Child();

    What is Downcasting?
        Downcasting is the process of converting a Parent class reference back into a Child class reference.

      - Requires explicit casting.
      - Used when you need to access child-specific methods.
      - Should be done carefully because an incorrect cast causes a ClassCastException.
      - It is recommended to use instanceof before downcasting.

    Syntax
        Child reference = (Child) parentReference;
*/

class Animals {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dogs extends Animals {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    void run() {
        System.out.println("Dog is running");
    }
}

public class UpDownCasting {

    public static void main(String[] args) {

        // Upcasting
        Animals a = new Dogs();

        a.sound();   // Calls Dog's sound() method
        // a.run();  // Not allowed because 'a' is an Animals reference

        // Downcasting
        Dogs d = (Dogs) a;

        d.sound();
        d.run();
    }
}