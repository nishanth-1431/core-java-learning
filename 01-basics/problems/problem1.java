import java.util.Scanner;
public class problem1 {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name ");
        String name = sc.nextLine();
        System.out.println("enter your department : ");
        String department = sc.nextLine();
        System.out.println("enter your collage : ");
        String collage = sc.nextLine();
        System.out.println("------student details------");
        System.out.println("name       : " + name);
        System.out.println("department : " + department);   
        System.out.println("collage    : " + collage);
    }
}
