/* 15. Banking System
   Topics Used: Multilevel Inheritance

   Hierarchy:
   Account → SavingsAccount → PremiumSavings
*/

class Account {
    int accountNumber;

    void createAccount() {
        System.out.println("Account created successfully.");
    }
}

class SavingsAccount extends Account {
    double balance;

    void deposit() {
        System.out.println("Amount deposited successfully.");
    }
}

class PremiumSavings extends SavingsAccount {
    double cashback;

    void showCashback() {
        System.out.println("Cashback Earned : Rs." + cashback);
    }
}

public class problem15 {
    public static void main(String[] args) {

        PremiumSavings ps = new PremiumSavings();

        ps.accountNumber = 1001;
        ps.balance = 50000;
        ps.cashback = 750;

        System.out.println("===== Premium Savings Account =====");
        System.out.println("Account Number : " + ps.accountNumber);
        ps.createAccount();

        System.out.println("Balance : Rs." + ps.balance);
        ps.deposit();

        ps.showCashback();
    }
}