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

