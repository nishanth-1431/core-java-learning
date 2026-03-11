import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ========== EXAMPLE 1: Creating and printing an array ==========
        int[] marks = {90, 85, 78, 92, 88};

        System.out.println("===== Student Marks =====");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }

        // ========== EXAMPLE 2: Taking array input from user ==========
        System.out.print("\nHow many numbers do you want to enter? ");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // ========== EXAMPLE 3: Finding the sum and average ==========
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = (double) sum / numbers.length;

        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + average);

        // ========== EXAMPLE 4: Finding the largest element ==========
        int max = numbers[0];  // Assume first element is the largest
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Largest number = " + max);

        // ========== EXAMPLE 5: Finding the smallest element ==========
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Smallest number = " + min);

        sc.close();
    }
}
