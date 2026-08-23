/*7. Banking Application — Permanent Account ID
A bank assigns a unique ID to every account.
    Create a BankAccount class that stores:
        • Account ID
        • Account holder name
        • Balance
    Requirements:
        • The Account ID must remain unchanged after it is assigned.
        • Protect the account holder name and balance from direct access.
        • Allow the account holder name and balance to be updated.
        • Display complete account information.
        • Use the final keyword for the Account ID.
        • Try changing the Account ID and observe what happens.
*/
class BankAccount7 {
    private final int accountId;
    private String accountHolderName;
    private double balance;

    BankAccount7(int accountId) {
        this.accountId = accountId;
    }

    int getAccountId() {
        return accountId;
    }
    String getAccountHolderName() {
        return accountHolderName;
    }
    double getBalance() {
        return balance;
    }

    void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    void setBalance(double balance) {
        this.balance = balance;
    }
}

public class problem7 {
    public static void main(String[] args) {
        BankAccount7 account = new BankAccount7(1001);
        account.setAccountHolderName("Alice");
        account.setBalance(5000.50);
        
        // account.accountId = 1002; // This would cause a compilation error because it's final

        System.out.println("Account ID   : " + account.getAccountId());
        System.out.println("Name         : " + account.getAccountHolderName());
        System.out.println("Balance      : $" + account.getBalance());
    }
}
