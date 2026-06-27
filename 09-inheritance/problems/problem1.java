/* 1. Online Shopping - Product
Topics Used: Single Inheritance
Product
  Fields:    productName, price
  Methods:   displayProduct()
Electronics extends Product
  Fields:    warranty
  Methods:   showWarranty()
 */
class Product{
    String productName;
    double price;
    void displayProduct() {
    System.out.println("Product Name : " + productName);
    System.out.println("Price : " + price);
}
}
class Electronics extends Product{
    int warranty;
    int showWarranty(){
        return warranty;
    }
}
public class problem1 {
    public static void main(String[] args) {
        Electronics e1 =new Electronics();
        e1.productName="iphone 14 Pro";
        e1.price=123999.11;
        e1.warranty=8;
        e1.displayProduct();
        System.out.println("warranty : "+e1.showWarranty()+" months");
    }
}
