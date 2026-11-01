/* 11. Online Shopping System
Topics Used: Multilevel Inheritance
Hierarchy: Product → ElectronicProduct → Laptop
Product
  Fields:    name, price
ElectronicProduct
  Fields:    warranty
Laptop
  Fields:    ram
Note: Create one Laptop object and display all details.
 */
class Product{
    String name;
    double price;
}
class ElectronicProduct extends Product{
    int warranty;
}
class Laptop extends ElectronicProduct{
    int ram ;

    void displayDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Warranty: " + warranty + " years");
        System.out.println("RAM: " + ram + " GB");
    }
}
public class problem11 {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();

        l1.name = "HP Pavillion";
        l1.price = 75000;
        l1.warranty=2;
        l1.ram=6;

        l1.displayDetails();

    }
}
