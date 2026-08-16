/*2. College Management System — Department & Professor
A college contains multiple departments. Each department has professors.
•	Create Professor and Department. 
•	A professor can exist without being assigned to a department. 
•	A department should store multiple professors. 
•	Display all professors belonging to a department. 
 */
class Professor {

    String professorName;
    String subject;

    void displayProfessor() {
        System.out.println("Professor: " + professorName);
        System.out.println("Subject: " + subject);
        System.out.println();
    }
}

class Department {

    String departmentName;
    Professor[] professors; // Department HAS-A Professor

    void displayProfessors() {
        System.out.println("Department: " + departmentName);
        System.out.println("Professors:");

        for (int i = 0; i < professors.length; i++) {
            professors[i].displayProfessor();
        }
    }
}

public class problem2 {

    public static void main(String[] args) {

        // Professors are created independently
        Professor professor1 = new Professor();
        professor1.professorName = "Dr. Kumar";
        professor1.subject = "Java";

        Professor professor2 = new Professor();
        professor2.professorName = "Dr. Priya";
        professor2.subject = "Database";

        // Department is created separately
        Department department = new Department();
        department.departmentName = "Computer Science";

        // Aggregation happens here
        department.professors = new Professor[2];

        department.professors[0] = professor1;
        department.professors[1] = professor2;

        department.displayProfessors();
    }
}
