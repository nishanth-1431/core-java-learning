/* 16. E-Commerce Users
Topics Used: Hierarchical Inheritance
Parent Class: User
Child Classes: Customer, Seller, DeliveryPartner
Note: Each child should have one unique field and one unique method.
 */
class User {
    String username;
    String email;

    void showUser() {
        System.out.println("User: " + username);
        System.out.println("Email: " + email);
        System.out.println();
    }
}

class Customer extends User {
    int cartCount;

    void placeOrder() {
        System.out.println("Cart Items: " + cartCount);
        System.out.println("Order placed successfully");
        System.out.println();
    }
}

class Seller extends User {
    String storeName;

    void addProduct() {
        System.out.println("Store Name: " + storeName);
        System.out.println("Product added successfully");
        System.out.println();
    }
}

class DeliveryPartner extends User {
    String vehicleType;

    void deliverOrder() {
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Order delivered successfully");
        System.out.println();
    }
}

public class problem16 {
    public static void main(String[] args) {

        Customer c = new Customer();
        c.username = "Nishanth";
        c.email = "nishanth@gmail.com";
        c.cartCount = 3;

        Seller s = new Seller();
        s.username = "SellerA";
        s.email = "seller@gmail.com";
        s.storeName = "TechZone";

        DeliveryPartner d = new DeliveryPartner();
        d.username = "Ravi";
        d.email = "ravi@gmail.com";
        d.vehicleType = "Bike";

        c.showUser();
        c.placeOrder();

        s.showUser();
        s.addProduct();

        d.showUser();
        d.deliverOrder();
    }
}
