/*
Definition

Multiple Interfaces:

    Java does not support multiple inheritance using classes.
    A class cannot extend two classes at the same time.
    But a class can implement multiple interfaces.
    This allows a class to inherit behavior contracts from multiple interfaces.

Syntax:

    interface Interface1 {
        void method1();
    }

    interface Interface2 {
        void method2();
    }

    class ClassName implements Interface1, Interface2 {
        
        public void method1() {
            // implementation
        }

        public void method2() {
            // implementation
        }
    }

Example:
    A Smartphone can have multiple capabilities.

    It can take photos using Camera.
    It can play music using MusicPlayer.

    Therefore, Smartphone implements both interfaces.
*/

interface Camera {

    void takePhoto();
}

interface MusicPlayer {

    void playMusic();
}

class Smartphone implements Camera, MusicPlayer {

    @Override
    public void takePhoto() {
        System.out.println("Smartphone takes a photo.");
    }

    @Override
    public void playMusic() {
        System.out.println("Smartphone plays music.");
    }
}

public class multipleInterfaces {

    public static void main(String[] args) {

        Smartphone phone = new Smartphone();

        phone.takePhoto();
        phone.playMusic();
    }
}

