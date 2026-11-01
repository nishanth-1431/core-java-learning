/*Problem 10 – Payment System (Method Overriding)
Create a parent class Payment with a method pay(). Create child classes UPI, CreditCard, and Cash that override the pay() method.
 */
class Payment {
    public void pay() {
        System.out.println("Processing payment...");
    }
}

class UPI extends Payment {
    @Override
    public void pay() {
        System.out.println("Payment completed using UPI.");
    }
}

class CreditCard extends Payment {
    @Override
    public void pay() {
        System.out.println("Payment completed using Credit Card.");
    }
}

class Cash extends Payment {
    @Override
    public void pay() {
        System.out.println("Payment completed using Cash.");
    }
}

public class problem10 {
    public static void main(String[] args) {

        Payment p1 = new UPI();
        Payment p2 = new CreditCard();
        Payment p3 = new Cash();

        p1.pay();
        p2.pay();
        p3.pay();
    }
}

