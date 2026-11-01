/*6. Bank Account
Create a BankAccount class.
Fields:
- accountHolder
- balance
Methods:
- deposit()
- withdraw()
- checkBalance()
Update the balance using the methods and display the final balance.
Topics Used:
- Instance Variables
- Methods
- Object State
 */
class BankAccount {

    String accountHolder;
    double balance;

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: ₹" + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public void checkBalance() {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Current Balance: ₹" + balance);
    }
}

public class problem6 {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.accountHolder = "Nishanth";
        account.balance = 10000;

        account.deposit(2500);
        account.withdraw(3000);

        account.checkBalance();
    }
}
