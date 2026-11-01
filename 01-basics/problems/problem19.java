// Write a Java program using Scanner to calculate student percentage.
import java.util.Scanner;
public class problem19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks Obtained: ");
        double obtained = sc.nextDouble();
        System.out.print("Enter Total Marks: ");
        double total = sc.nextDouble();
        double percentage = (obtained / total) * 100.0;
        System.out.println("Percentage: " + percentage + "%");
    }
}
