/* Problem 3 – Student Information (Method Overloading)
Create a Student class and overload the display() method to display:
•	Student name
•	Student name and age
•	Student name, age, and department
 */
public class problem3 {
    static void Student(String name){
        System.out.println("the student name is "+name);
    }
    static void Student(String name , int age ){
        System.out.printf("Im %s and im %d years old",name , age);
    }
    static void Student(String name , int age , String dept){
         System.out.printf("\nIm %s and im %d years old , from %s Department",name , age , dept);
    }
    public static void main(String[] args) {

        Student("nishanth");
        Student("nishanth",19);
        Student("nishanth",19,"EIE");
    }
}
