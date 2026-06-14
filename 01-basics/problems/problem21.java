// Write a Java program using Scanner to calculate fuel cost for travel.
import java.util.Scanner;
public class problem21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Distance in km: ");
        double distance = sc.nextDouble();
        System.out.print("Enter Fuel Efficiency (km per liter): ");
        double efficiency = sc.nextDouble();
        System.out.print("Enter Fuel Price per liter: ");
        double pricePerLiter = sc.nextDouble();
        double fuelCost = (distance / efficiency) * pricePerLiter;
        System.out.println("Total Fuel Cost: " + fuelCost);
    }
}
