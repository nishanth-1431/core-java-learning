/* 4. Fan
Create a Fan class.
Fields:
- brand
- speed
Methods:
- increaseSpeed()
- showSpeed()
Increase the speed twice and display the current speed.
Topics Used:
- Object State
- Methods
 */
import java.util.*;
class Fan{
    String brand;
    int speed;
    void increaseSpeed() {
        speed++;
    }

    int showSpeed() {
       return speed;  
    }
    void decreasesSpeed(){
    if(speed>0){
        speed--;
    }
  }
}
public class problem4 {
    public static void main(String[] args) {
        Fan a = new Fan();
        Scanner sc = new Scanner(System.in);
        System.out.println("functions : "+"\n1. Increase speed "+"\n2. decrease speed "+"\n3.Show speed "+"\n4.show Brand ");
        System.out.print("Enter a choice : ");
        int choise = sc.nextInt();
        a.brand="usha";
        switch (choise) {
           case 1 :
            System.out.println(" Speed is increased by 1 ");
            a.increaseSpeed();
            break;
           case 2:
            System.out.println(" Speed is decreased by 1 ");
            a.decreasesSpeed();
            break;
           case 3:
            System.out.println("current Speed is "+ a.showSpeed());
            break;
           case 4 :
            System.err.println("Brand is "+a.brand);
            break;
            default :
            System.out.println("invalid Choise");
            break;
        }
        sc.close();
    }
}
