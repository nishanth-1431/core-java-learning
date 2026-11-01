

/*1. E-Commerce Application — Customer Profile
An e-commerce application needs to store and manage customer information.
    Create a Customer class that stores:
        • Customer ID
        • Customer name
        • Email
        • Phone number
    Requirements:
        • Protect the customer data from direct access.
        • The application should be able to read customer information.
        • The application should be able to update the customer's name, email, and phone number.
        • Display the complete customer profile.
        • Use the this keyword where appropriate.
 */
class Customer{
    private int cId;
    private String cName;
    private String cMail;
    private int phNum;

    // these functions returns the values stored in them
    int getId(){
        return cId;
    }
    String getName(){
        return cName;
    }
    String getMail(){
        return cMail;
    }
    int getPhone(){
        return phNum;
    }
    //these functions set the values 
     void setId(int id){
        cId = id;
    }
    void setName(String name){
        cName=name;
    }
    void setMail(String mail){
        cMail=mail;
    }
    void setPhone(int phone){
        phNum=phone;
    }

}
public class problem1 {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("john");
        customer.setId(01);
        customer.setMail("john24@gmail.com");
        customer.setPhone(123456789);

        System.out.println("Name : "+customer.getName());
        System.out.println("Id   : "+customer.getId());
        System.out.println("email : "+customer.getMail());
        System.out.println("phone number : "+customer.getPhone());
    }
}
