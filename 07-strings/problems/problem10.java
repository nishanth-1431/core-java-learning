/* 10. Check whether a string starts with a given prefix and ends with a given suffix.
    Topics: startsWith(), endsWith(), if-else
 */
/* Check whether the website starts with "https://"
   and ends with ".com"
*/

public class problem10 {
    public static void main(String[] args) {

        String website = "https://www.amazon.com";

        if (website.startsWith("https://") && website.endsWith(".com")) {
            System.out.println("Secure Commercial Website");
        } else {
            System.out.println("Invalid Website");
        }
    }
}