/*19. Online Banking Dashboard
Topics Used: Hierarchical Inheritance
Parent Class: Account
Child Classes: SavingsAccount, CurrentAccount, LoanAccount
Note: Each child should have one additional field and one method.
*/

class Account {
    String accountHolder;
    int accountNumber;
    double balance;

    void displayAccount() {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : Rs." + balance);
    }
}

class SavingsAccount extends Account {
    double interestRate;

    void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Interest Earned : Rs." + interest);
    }
}

class CurrentAccount extends Account {
    double overdraftLimit;

    void showOverdraft() {
        System.out.println("Overdraft Limit : Rs." + overdraftLimit);
    }
}

class LoanAccount extends Account {
    double loanAmount;

    void payEMI() {
        System.out.println("EMI Paid Successfully.");
    }
}

public class problem19 {
    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount();
        sa.accountHolder = "Nishanth";
        sa.accountNumber = 1001;
        sa.balance = 50000;
        sa.interestRate = 6.5;

        CurrentAccount ca = new CurrentAccount();
        ca.accountHolder = "Rahul";
        ca.accountNumber = 1002;
        ca.balance = 80000;
        ca.overdraftLimit = 25000;

        LoanAccount la = new LoanAccount();
        la.accountHolder = "Kumar";
        la.accountNumber = 1003;
        la.balance = 10000;
        la.loanAmount = 500000;

        System.out.println("===== Savings Account =====");
        sa.displayAccount();
        sa.calculateInterest();

        System.out.println("\n===== Current Account =====");
        ca.displayAccount();
        ca.showOverdraft();

        System.out.println("\n===== Loan Account =====");
        la.displayAccount();
        System.out.println("Loan Amount : Rs." + la.loanAmount);
        la.payEMI();
    }
}