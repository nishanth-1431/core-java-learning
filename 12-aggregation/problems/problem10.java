/*10. Real-world Project — University & Student
Create:
University
Student
Requirements:
•	A university has many students. 
•	A student can exist independently. 
•	A student can potentially transfer to another university. 
•	University should maintain a collection of students. 
•	Add/remove students. 
•	Display university details and enrolled students.
 */
class Student {

    String studentName;
    String department;

    void displayStudent() {
        System.out.println("Student: " + studentName);
        System.out.println("Department: " + department);
        System.out.println();
    }
}
class University {

    String universityName;
    Student[] students; // University HAS-A Student

    void addStudent(Student student, int index) {
        students[index] = student;
    }

    void removeStudent(int index) {
        students[index] = null;
    }

    void displayStudents() {

        System.out.println("University: " + universityName);
        System.out.println("Students:");

        for (int i = 0; i < students.length; i++) {

            if (students[i] != null) {
                students[i].displayStudent();
            }
        }
    }
}

public class problem10 {

    public static void main(String[] args) {

        // Students exist independently
        Student student1 = new Student();
        student1.studentName = "Nishanth";
        student1.department = "EIE";

        Student student2 = new Student();
        student2.studentName = "Arun";
        student2.department = "CSE";

        Student student3 = new Student();
        student3.studentName = "Priya";
        student3.department = "ECE";

        // Create University 1
        University university1 = new University();
        university1.universityName = "ABC University";
        university1.students = new Student[3];

        // Add students
        university1.addStudent(student1, 0);
        university1.addStudent(student2, 1);
        university1.addStudent(student3, 2);

        // Display
        university1.displayStudents();

        // Remove student2
        university1.removeStudent(1);

        System.out.println("After removing Arun:");
        university1.displayStudents();

        // Create another University
        University university2 = new University();
        university2.universityName = "XYZ University";
        university2.students = new Student[2];

        // Transfer Arun to another university
        university2.addStudent(student2, 0);

        System.out.println("After transferring Arun:");
        university2.displayStudents();
    }
}