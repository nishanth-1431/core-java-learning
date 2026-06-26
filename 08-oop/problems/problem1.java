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
       // Approach 1: Using a method
      s1.display();

      // OR

      // Approach 2: Accessing instance variables directly
      System.out.println("Name of Student       : " + s1.name);
      System.out.println("Age of Student        : " + s1.age);
      System.out.println("Department of Student : " + s1.dept);
   }
}
