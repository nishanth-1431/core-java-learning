/* Problem 5 - Bank Interest
Create an abstract class Bank.
• Create an abstract method interestRate().
• Create SBI and HDFC.
• Display the interest rate of each bank.
*/

abstract class Bank {
    abstract void interestRate();
}

class SBI extends Bank {
    @Override
    void interestRate() {
        System.out.println("SBI Interest Rate: 7%");
    }
}

class HDFC extends Bank {
    @Override
    void interestRate() {
        System.out.println("HDFC Interest Rate: 7.5%");
    }
}

public class problem5 {
    public static void main(String[] args) {

        SBI sbi = new SBI();
        HDFC hdfc = new HDFC();

        sbi.interestRate();
        hdfc.interestRate();
    }
}