/*5. Hospital System — Hospital & Doctor
A hospital has several doctors.
•	Create Hospital and Doctor. 
•	Doctors can work at different hospitals during their careers. 
•	A doctor should exist independently of a particular hospital. 
•	Add doctors to a hospital. 
•	Display hospital information and its doctors. 
 */
class Doctor {

    String doctorName;
    String specialization;

    void displayDoctor() {
        System.out.println("Doctor: " + doctorName);
        System.out.println("Specialization: " + specialization);
        System.out.println();
    }
}

class Hospital {

    String hospitalName;
    Doctor[] doctors; // Hospital HAS-A Doctor

    void displayHospital() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Doctors:");

        for (int i = 0; i < doctors.length; i++) {
            doctors[i].displayDoctor();
        }
    }
}

public class problem5 {

    public static void main(String[] args) {

        // Doctors are created independently
        Doctor doctor1 = new Doctor();
        doctor1.doctorName = "Dr. Arun";
        doctor1.specialization = "Cardiologist";

        Doctor doctor2 = new Doctor();
        doctor2.doctorName = "Dr. Priya";
        doctor2.specialization = "Neurologist";

        Doctor doctor3 = new Doctor();
        doctor3.doctorName = "Dr. Kumar";
        doctor3.specialization = "Dermatologist";

        // Hospital is created separately
        Hospital hospital = new Hospital();
        hospital.hospitalName = "City Hospital";

        // Aggregation
        hospital.doctors = new Doctor[3];

        hospital.doctors[0] = doctor1;
        hospital.doctors[1] = doctor2;
        hospital.doctors[2] = doctor3;

        // Display hospital and doctors
        hospital.displayHospital();
    }
}