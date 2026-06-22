/*31.	BMI Calculator
Using (if-else-if ladder)
Calculate BMI and display classification: Underweight, Normal, Overweight, Obese.
*/
import java.util.Scanner;

public class problem31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();
        
        System.out.print("Enter height in meters: ");
        double height = sc.nextDouble();
        
        if (height > 0) {
            double bmi = weight / (height * height);
            System.out.printf("Your BMI is: %.2f\n", bmi);
            
            if (bmi < 18.5) {
                System.out.println("Classification: Underweight");
            } else if (bmi < 25) {
                System.out.println("Classification: Normal");
            } else if (bmi < 30) {
                System.out.println("Classification: Overweight");
            } else {
                System.out.println("Classification: Obese");
            }
        } else {
            System.out.println("Error: Height must be greater than zero.");
        }
    }
}
