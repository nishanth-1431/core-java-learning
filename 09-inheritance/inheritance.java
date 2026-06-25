/* What is Inheritance :
Inheritance means one class gets properties of another class.
Parent → Superclass 
Child → Subclass 

 */
public class inheritance {
  public static void main(String[] args) {
      vehicle v = new vehicle();
      v.engine();
      v.speed();
  }
    }

class car{
    void speed(){
        System.out.println("100 kmph");
    }
}
class vehicle extends car{
    void engine(){
        System.out.println("petrol");
    }
}