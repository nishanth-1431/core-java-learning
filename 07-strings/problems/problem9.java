/* 9. Extract the username and domain from an email address.
   Example: nishanth@gmail.com
   Topics: indexOf(), substring()
 */
import java.util.Scanner;
public class problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Email :");
        String email = sc.nextLine();
        String user = email.substring( 0 , email.indexOf('@') );
        String domain = email.substring( email.indexOf('@')+1);
        System.out.println("The User name is : "+ user);
        System.out.println("The domain is    : "+ domain);
    }
}
