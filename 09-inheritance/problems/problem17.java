/* 17. Hospital Staff
   Topics Used: Hierarchical Inheritance

   Parent Class: Person
   Child Classes: Doctor, Nurse, Receptionist
*/

class Person {
    String name;
    int age;

    void displayPerson() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

class Doctor extends Person {
    String specialization;

    void treatPatient() {
        System.out.println("Doctor is treating the patient.");
    }
}

class Nurse extends Person {
    String shift;

    void assistDoctor() {
        System.out.println("Nurse is assisting the doctor.");
    }
}

class Receptionist extends Person {
    int counterNumber;

    void bookAppointment() {
        System.out.println("Appointment booked successfully.");
    }
}

public class problem17 {
    public static void main(String[] args) {

        Doctor d = new Doctor();
        d.name = "Arun";
        d.age = 40;
        d.specialization = "Cardiologist";

        Nurse n = new Nurse();
        n.name = "Priya";
        n.age = 28;
        n.shift = "Night";

        Receptionist r = new Receptionist();
        r.name = "Kavya";
        r.age = 25;
        r.counterNumber = 3;

        System.out.println("===== Doctor =====");
        d.displayPerson();
        System.out.println("Specialization : " + d.specialization);
        d.treatPatient();

        System.out.println("\n===== Nurse =====");
        n.displayPerson();
        System.out.println("Shift : " + n.shift);
        n.assistDoctor();

        System.out.println("\n===== Receptionist =====");
        r.displayPerson();
        System.out.println("Counter Number : " + r.counterNumber);
        r.bookAppointment();
    }
}