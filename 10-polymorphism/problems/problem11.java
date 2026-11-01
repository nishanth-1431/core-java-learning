/*Problem 11 – Bank Interest System (Runtime Polymorphism)
Create a parent class Bank with a method interestRate(). Create child classes SBI, HDFC, and ICICI that return different interest rates. Use a parent class reference to call the overridden methods.
 */
class Bank {
    public void interestRate() {
        System.out.println("Bank Interest Rate");
    }
}

class SBI extends Bank {
    @Override
    public void interestRate() {
        System.out.println("SBI Interest Rate: 6.5%");
    }
}

class HDFC extends Bank {
    @Override
    public void interestRate() {
        System.out.println("HDFC Interest Rate: 7.0%");
    }
}

class ICICI extends Bank {
    @Override
    public void interestRate() {
        System.out.println("ICICI Interest Rate: 6.8%");
    }
}

public class problem11 {
    public static void main(String[] args) {

        Bank b;

        b = new SBI();
        b.interestRate();

        b = new HDFC();
        b.interestRate();

        b = new ICICI();
        b.interestRate();
    }
}