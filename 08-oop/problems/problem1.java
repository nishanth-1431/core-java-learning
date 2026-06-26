/* 1. Student Details
Create a Student class.
Fields:
- name
- age
- department
Method:
- displayDetails()
Create one object in main() and display the student's details.
Topics Used:
- Class
- Object
- Fields
- Methods
 */

import java.util.*;
class student{
    String name = "Nishanth";
    int age = 19;
    String dept = "EIE";
    public void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(dept);
    }
}
public class problem1 {
   public static void main(String[] args) {
        student s1 = new student();
        s1.display(); 
   }
}
