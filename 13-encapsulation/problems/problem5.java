/*5. E-Commerce Application — Product Management
An online shopping platform needs to manage its products.
    Create a Product class that stores:
        • Product ID
        • Product name
        • Price
        • Stock quantity
    Requirements:
        • Protect the product information from direct access.
        • Allow the application to read product details.
        • Allow the product name, price, and stock quantity to be updated.
        • Display complete product information.
        • Use the this keyword where appropriate.
*/
class Product {
    private int productId;
    private String productName;
    private double price;
    private int stockQuantity;

    int getProductId() {
        return productId;
    }
    String getProductName() {
        return productName;
    }
    double getPrice() {
        return price;
    }
    int getStockQuantity() {
        return stockQuantity;
    }

    void setProductId(int productId) {
        this.productId = productId;
    }
    void setProductName(String productName) {
        this.productName = productName;
    }
    void setPrice(double price) {
        this.price = price;
    }
    void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
}

public class problem5 {
    public static void main(String[] args) {
        Product product = new Product();
        product.setProductId(101);
        product.setProductName("Laptop");
        product.setPrice(999.99);
        product.setStockQuantity(50);

        System.out.println("Product ID : " + product.getProductId());
        System.out.println("Name       : " + product.getProductName());
        System.out.println("Price      : $" + product.getPrice());
        System.out.println("Stock      : " + product.getStockQuantity());
    }
}
