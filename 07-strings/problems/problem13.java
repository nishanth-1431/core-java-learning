/*13. Convert the first letter of every word to uppercase.
    Example:
    "java full stack" → "Java Full Stack"
    Topics: charAt(), substring(), toUpperCase(), loops
 */
import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            String first = words[i].substring(0, 1).toUpperCase();
            String rest = words[i].substring(1);

            System.out.print(first + rest + " ");
        }

        sc.close();
    }
}