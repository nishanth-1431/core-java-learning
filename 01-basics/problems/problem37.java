// Write a Java program using DataInputStream to calculate average marks.
import java.io.DataInputStream;
import java.io.IOException;

public class problem37 {
    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.print("Enter Marks for Subject 1: ");
        double s1 = Double.parseDouble(dis.readLine());
        System.out.print("Enter Marks for Subject 2: ");
        double s2 = Double.parseDouble(dis.readLine());
        System.out.print("Enter Marks for Subject 3: ");
        double s3 = Double.parseDouble(dis.readLine());
        
        double average = (s1 + s2 + s3) / 3.0;
        System.out.println("\nAverage Marks: " + average);
    }
}
