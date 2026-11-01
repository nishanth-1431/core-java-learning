/* Problem 6 – Animal Sounds (Method Overriding)
Create a parent class Animal with a method sound().
 Create child classes Dog, Cat, and Cow that override
  the sound() method with their respective sounds.
*/
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog says: Bark");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat says: Meow");
    }
}

class Cow extends Animal {
    @Override
    void sound() {
        System.out.println("Cow says: Moo");
    }
}

public class problem6 {
    public static void main(String[] args) {

        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Cow();

        a1.sound();
        a2.sound();
        a3.sound();
    }
}