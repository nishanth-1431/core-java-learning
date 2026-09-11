/*
Handling File Exceptions:

    File operations are prone to errors (e.g., file not found, permission denied). 
    Java forces you to handle these checked exceptions to make programs robust.

Core Concepts:

    1. FileNotFoundException: Thrown when an attempt to open a file denoted by a specified pathname fails.
    2. IOException: The general class of exceptions produced by failed or interrupted I/O operations.

Syntax:

    try {
        Scanner scanner = new Scanner(new File("missing.txt"));
    } catch (FileNotFoundException e) {
        System.out.println("File not found! " + e.getMessage());
    } catch (IOException e) {
        System.out.println("Other I/O error occurred.");
    }

Technical Explanation:

    • FileNotFoundException is a subclass of IOException.
    • Catch specific exceptions first (like FileNotFoundException) before catching broader ones (like IOException).
    • Checked exceptions mean the compiler forces you to either try-catch them or throw them in the method signature.

Important:

    Don't just suppress these exceptions; log them or provide a fallback mechanism (like creating the missing file).
*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class handlingExceptions {
    public static void main(String[] args) {
        File file = new File("doesNotExist.txt");
        
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Exception Caught: The file was not found.");
            // e.printStackTrace(); // Commented to keep output clean for demonstration
        }
    }
}
