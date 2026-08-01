/*Problem 6 - Printable Interface
Create an interface Printable.
•	Create a method print(). 
•	Create a class Document that implements the interface. 
•	Display a message using print(). 
 */
interface Printable{
    void print();
} 
class Document implements Printable{
    @Override 
    public 
    void print(){
        System.out.println("hello java");
    }
}
public class problem6 {
    public static void main(String[] args) {
        Printable p = new Document();
        p.print();
    }
}
