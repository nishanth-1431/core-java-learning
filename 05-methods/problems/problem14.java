/* 14. Free Delivery Eligibility
Free delivery if order amount exceeds ₹999.
Use: Method, condition
*/
import java.util.Scanner;

public class problem14 {

    static String freeDelivery(double amount) {

        if (amount > 999) {
            return "Eligible for Free Delivery";
        } else {
            return "Not Eligible for Free Delivery";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----- FREE DELIVERY CHECKER -----");
        System.out.print("Enter Order Amount : ");

        double amount = sc.nextDouble();

        String result = freeDelivery(amount);

        System.out.println("Order Amount : ₹" + amount);
        System.out.println("Status       : " + result);

        sc.close();
    }
}