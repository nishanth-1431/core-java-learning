import java.util.Scanner;
class Student {
    String name;
    int age;
}

public class main {
    public static void main(String[] args) {

        Student s1 = new Student();
        Scanner sc = new Scanner(System.in);
        s1.name = sc.nextLine();
        s1.age = sc.nextInt();

        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}   