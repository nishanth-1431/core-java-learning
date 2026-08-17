/*3. E-Commerce — Customer & Address
An e-commerce application stores customer information and their delivery address.
•	Create Customer and Address. 
•	A customer HAS-A delivery address. 
•	The address should be able to exist independently. 
•	Allow the customer to change their delivery address. 
•	Display customer + current address. 
 */
class Address {

    String city;
    String street;

    void displayAddress() {
        System.out.println("Street: " + street);
        System.out.println("City: " + city);
    }
}

class Customer {

    String customerName;
    Address address; // Customer HAS-A Address

    void changeAddress(Address newAddress) {
        address = newAddress;
    }

    void displayCustomer() {
        System.out.println("Customer: " + customerName);
        address.displayAddress();
    }
}

public class problem3 {

    public static void main(String[] args) {

        // Address exists independently
        Address address1 = new Address();

        address1.city = "Coimbatore";
        address1.street = "Avinashi Road";

        // Customer object
        Customer customer = new Customer();

        customer.customerName = "Nishanth";

        // Aggregation
        customer.address = address1;

        System.out.println("Current Address:");
        customer.displayCustomer();

        // New address created independently
        Address address2 = new Address();

        address2.city = "Chennai";
        address2.street = "Anna Nagar";

        // Customer changes address
        customer.changeAddress(address2);

        System.out.println("\nUpdated Address:");
        customer.displayCustomer();
    }
}