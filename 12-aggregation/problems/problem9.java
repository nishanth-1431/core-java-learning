/*Challenge Problem
9. Amazon-like Order System — Order & Product
Create:
Order
Product
Requirements:
•	An order can contain multiple products. 
•	A product exists independently of an order. 
•	The same product can appear in multiple orders. 
•	Display order details and all products. 
•	Calculate the total order price. 
•	Allow a product to be removed from an order. 
 */
class Product {

    String productName;
    double price;

    void displayProduct() {
        System.out.println("Product: " + productName);
        System.out.println("Price: Rs." + price);
    }
}

class Order {

    int orderId;
    Product[] products; // Order HAS-A Product

    void displayOrder() {

        System.out.println("Order ID: " + orderId);
        System.out.println("Products:");

        for (int i = 0; i < products.length; i++) {

            if (products[i] != null) {
                products[i].displayProduct();
                System.out.println();
            }
        }
    }

    void calculateTotal() {

        double total = 0;

        for (int i = 0; i < products.length; i++) {

            if (products[i] != null) {
                total = total + products[i].price;
            }
        }

        System.out.println("Total Price: Rs." + total);
    }

    void removeProduct(int index) {
        products[index] = null;
    }
}
public class problem9 {

    public static void main(String[] args) {

        // Products exist independently
        Product product1 = new Product();
        product1.productName = "Laptop";
        product1.price = 50000;

        Product product2 = new Product();
        product2.productName = "Mouse";
        product2.price = 1000;

        Product product3 = new Product();
        product3.productName = "Keyboard";
        product3.price = 2000;

        // Create first Order
        Order order1 = new Order();
        order1.orderId = 101;

        order1.products = new Product[3];

        // Add products to Order 1
        order1.products[0] = product1;
        order1.products[1] = product2;
        order1.products[2] = product3;

        order1.displayOrder();
        order1.calculateTotal();

        // Remove Mouse
        order1.removeProduct(1);

        System.out.println("\nAfter removing Mouse:");
        order1.displayOrder();
        order1.calculateTotal();

        // Create another Order
        Order order2 = new Order();
        order2.orderId = 102;

        order2.products = new Product[2];

        // Same product can be used in another Order
        order2.products[0] = product1;
        order2.products[1] = product2;

        System.out.println("\nOrder 2:");
        order2.displayOrder();
        order2.calculateTotal();
    }
}