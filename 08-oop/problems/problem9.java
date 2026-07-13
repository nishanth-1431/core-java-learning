/*9. Laptop
Create a Laptop class.
Fields:
- brand
- ram
- storage
Method:
- display()
Create three Laptop objects and display their details.
Topics Used:
- Objects
- Methods
 */
class Laptop {

    // Fields
    String brand;
    int ram;
    int storage;

    // Method to display laptop details
    void display() {
        System.out.println("Brand : " + brand);
        System.out.println("RAM : " + ram + " GB");
        System.out.println("Storage : " + storage + " GB");
    }
}

public class problem9 {
    public static void main(String[] args) {

        // Creating first Laptop object
        Laptop laptop1 = new Laptop();
        laptop1.brand = "Dell";
        laptop1.ram = 8;
        laptop1.storage = 512;

        // Creating second Laptop object
        Laptop laptop2 = new Laptop();
        laptop2.brand = "HP";
        laptop2.ram = 16;
        laptop2.storage = 1024;

        // Creating third Laptop object
        Laptop laptop3 = new Laptop();
        laptop3.brand = "Lenovo";
        laptop3.ram = 32;
        laptop3.storage = 2048;

        // Displaying laptop details
        System.out.println("Laptop 1");
        laptop1.display();

        System.out.println("\nLaptop 2");
        laptop2.display();

        System.out.println("\nLaptop 3");
        laptop3.display();
    }
}
