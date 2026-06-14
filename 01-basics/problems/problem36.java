// Write a Java program using DataInputStream to calculate total marks.
import java.io.DataInputStream;
import java.io.IOException;

public class problem36 {
    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.print("Enter Marks for Subject 1: ");
        double s1 = Double.parseDouble(dis.readLine());
        System.out.print("Enter Marks for Subject 2: ");
        double s2 = Double.parseDouble(dis.readLine());
        System.out.print("Enter Marks for Subject 3: ");
        double s3 = Double.parseDouble(dis.readLine());
        
        double total = s1 + s2 + s3;
        System.out.println("\nTotal Marks: " + total);
    }
}
