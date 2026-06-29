
/* 14. Education Portal
   Topics Used: Multilevel Inheritance

   Hierarchy:
   User → Student → GraduateStudent
*/

class User {
    String username;

    void login() {
        System.out.println("User logged in successfully.");
    }
}

class Student extends User {
    String course;

    void enrollCourse() {
        System.out.println("Course enrolled successfully.");
    }
}

class GraduateStudent extends Student {
    String specialization;

    void submitThesis() {
        System.out.println("Thesis submitted successfully.");
    }
}

public class problem14 {
    public static void main(String[] args) {

        GraduateStudent gs = new GraduateStudent();

        gs.username = "Nishanth";
        gs.course = "B.E EIE";
        gs.specialization = "Artificial Intelligence";

        System.out.println("===== Graduate Student =====");
        System.out.println("Username       : " + gs.username);
        gs.login();

        System.out.println("Course         : " + gs.course);
        gs.enrollCourse();

        System.out.println("Specialization : " + gs.specialization);
        gs.submitThesis();
    }
}