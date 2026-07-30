/*
Problem 2 - Animal Sounds

Create an abstract class Animal.
• Create an abstract method makeSound().
• Create a normal method sleep().
• Create classes Dog and Cat.
• Implement makeSound() in both classes.
• Display their sounds.
*/

abstract class Animal {
    abstract void makeSound();

    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Dog : Bark Bark");
    }
}

class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Cat : Meow Meow");
    }
}

public class problem2 {
    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        dog.sleep();

        System.out.println();

        cat.makeSound();
        cat.sleep();
    }
}