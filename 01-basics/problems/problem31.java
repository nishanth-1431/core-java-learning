// Write a Java program using DataInputStream to read and print student name.
import java.io.DataInputStream;
import java.io.IOException;

public class problem31 {
    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.print("Enter Student Name: ");
        String name = dis.readLine();
        System.out.println("Student Name: " + name);
    }
}
