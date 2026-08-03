/*Problem 12 – Notification Service (Runtime Polymorphism)
Create a parent class Notification with a method send(). Create child classes EmailNotification,
 SMSNotification, and PushNotification that override the send() method. Store all objects in an 
 array of Notification and call the method using a loop.
 */
class Notification {
    public void send() {
        System.out.println("Sending Notification...");
    }
}

class EmailNotification extends Notification {
    @Override
    public void send() {
        System.out.println("Sending Email Notification.");
    }
}

class SMSNotification extends Notification {
    @Override
    public void send() {
        System.out.println("Sending SMS Notification.");
    }
}

class PushNotification extends Notification {
    @Override
    public void send() {
        System.out.println("Sending Push Notification.");
    }
}

public class problem12 {
    public static void main(String[] args) {

        Notification[] notifications = {
            new EmailNotification(),
            new SMSNotification(),
            new PushNotification()
        };

        for (Notification notification : notifications) {
            notification.send();
        }
    }
}