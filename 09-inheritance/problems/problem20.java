/* 20. Mini E-Commerce Website (Challenge)
Topics Used: Hierarchical Inheritance
User
  Fields:    username, email
  Methods:   login()
Customer
  Fields:    address
  Methods:   placeOrder()
Seller
  Fields:    shopName
  Methods:   addProduct()
Admin
  Fields:    adminCode
  Methods:   removeProduct()
Note: Create one object of each class and demonstrate inheritance.
 */
class User {
    String username;
    String email;

    void login() {
        System.out.println("User logged in successfully.");
    }
}

class Customer extends User {
    String address;

    void placeOrder() {
        System.out.println("Order placed successfully.");
    }

    void displayCustomer() {
        System.out.println("Customer Details");
        System.out.println("Username : " + username);
        System.out.println("Email    : " + email);
        System.out.println("Address  : " + address);
    }
}

class Seller extends User {
    String shopName;

    void addProduct() {
        System.out.println("Product added successfully.");
    }

    void displaySeller() {
        System.out.println("\nSeller Details");
        System.out.println("Username : " + username);
        System.out.println("Email    : " + email);
        System.out.println("Shop Name: " + shopName);
    }
}

class Admin extends User {
    String adminCode;

    void removeProduct() {
        System.out.println("Product removed successfully.");
    }

    void displayAdmin() {
        System.out.println("\nAdmin Details");
        System.out.println("Username  : " + username);
        System.out.println("Email     : " + email);
        System.out.println("Admin Code: " + adminCode);
    }
}

public class problem20 {
    public static void main(String[] args) {

        Customer c = new Customer();
        c.username = "Nishanth";
        c.email = "nish@gmail.com";
        c.address = "Coimbatore";

        Seller s = new Seller();
        s.username = "Raj";
        s.email = "raj@gmail.com";
        s.shopName = "Tech Store";

        Admin a = new Admin();
        a.username = "Admin";
        a.email = "admin@gmail.com";
        a.adminCode = "ADM101";

        c.displayCustomer();
        c.login();
        c.placeOrder();

        s.displaySeller();
        s.login();
        s.addProduct();

        a.displayAdmin();
        a.login();
        a.removeProduct();
    }
}