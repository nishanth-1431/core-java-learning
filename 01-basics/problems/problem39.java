// Write a Java program using DataInputStream to read hospital patient details.
import java.io.DataInputStream;
import java.io.IOException;

public class problem39 {
    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);
        System.out.print("Enter Patient ID: ");
        int id = Integer.parseInt(dis.readLine());
        System.out.print("Enter Patient Name: ");
        String name = dis.readLine();
        System.out.print("Enter Patient Age: ");
        int age = Integer.parseInt(dis.readLine());
        System.out.print("Enter Patient Disease/Reason: ");
        String disease = dis.readLine();
        
        System.out.println("\n--- Hospital Patient Details ---");
        System.out.println("Patient ID: " + id);
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + age);
        System.out.println("Disease/Reason: " + disease);
    }
}
