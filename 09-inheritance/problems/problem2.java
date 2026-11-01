/*2. E-Commerce User System
Topics Used: Single Inheritance
User
  Fields:    username, email
  Methods:   login()
Customer extends User
  Fields:    address
  Methods:   placeOrder()
 */
class user {
    String username;
    String email;
    void login(){
        System.out.println(username+" succesfully logged in");
    }
}
class Customer extends user{
    String address;
    void placeOrder(){
        System.out.println(username + " placed a order. ");
        System.out.println("Delivery address is "+address );
    }
}
public class problem2 {
    public static void main(String[] args) {
        Customer c1 = new Customer();

        c1.username = "nishanth-1431";
        c1.email = "hinishanth777@gmail.com";

        c1.address = "coimbatore, tamilnadu .";

        c1.login();
        c1.placeOrder();
    }
}
