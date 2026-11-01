/*2. Banking Application — Bank Account
A banking application needs to manage customer bank accounts.
    Create a BankAccount class that stores:
        • Account number
        • Account holder name
        • Balance
    Requirements:
        • Protect the account information from direct access.
        • Allow the application to read the account details.
        • Allow the account holder name to be updated.
        • Allow the balance to be updated through the class.
        • Display the complete account details.
        • Use the this keyword where appropriate.
        Think about why the balance should not be directly accessible.
 */
class BankAccount{
    private int accNum;
    private String name;
    private double balance;

    int getAccNum(){
        return accNum;
    }
    String getName(){
        return name;
    }
    Double getBalance(){
        return balance;
    }
    
    void updateAccountNumber(int accNum){
       this.accNum=accNum;
    }
    void updateName(String name){
       this.name=name;
    }
    void updateBalance(double balance){
        this.balance = balance;
    }
    
}
public class problem2 {
   public static void main(String[] args) {
    
    BankAccount account = new BankAccount();

    account.updateAccountNumber(101);
    account.updateName("John");
    account.updateBalance(50000.0);

    System.out.println("Account Number : " + account.getAccNum());
    System.out.println("Account Holder : " + account.getName());
    System.out.println("Balance        : " + account.getBalance());
}
}
