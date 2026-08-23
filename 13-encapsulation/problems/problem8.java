/*8. Hospital Management System — Person and Doctor
A hospital management system stores information about doctors.
    Create the following class relationship:
        Person -> Doctor
    The Person class should store:
        • Name
        • Phone number
    The Doctor class should store:
        • Doctor ID
        • Specialization
        • Consultation fee
    Requirements:
        • Protect all data from direct access.
        • Doctor should inherit from Person.
        • Allow the doctor's information to be updated where appropriate.
        • The Doctor ID must remain unchanged.
        • Use this where appropriate.
        • Use super to access information from the parent class.
        • Use final for the Doctor ID.
        • Display the complete doctor information.
*/
class Person {
    private String name;
    private long phoneNumber;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

class Doctor extends Person {
    private final int doctorId;
    private String specialization;
    private double consultationFee;

    Doctor(int doctorId, String name, long phoneNumber) {
        this.doctorId = doctorId;
        super.setName(name);
        super.setPhoneNumber(phoneNumber);
    }

    public int getDoctorId() {
        return doctorId;
    }
    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public double getConsultationFee() {
        return consultationFee;
    }
    public void setConsultationFee(double consultationFee) {
        this.consultationFee = consultationFee;
    }
}

public class problem8 {
    public static void main(String[] args) {
        Doctor doctor = new Doctor(303, "Dr. Smith", 1234567890L);
        doctor.setSpecialization("Cardiology");
        doctor.setConsultationFee(150.0);

        System.out.println("Doctor ID       : " + doctor.getDoctorId());
        System.out.println("Name            : " + doctor.getName());
        System.out.println("Phone number    : " + doctor.getPhoneNumber());
        System.out.println("Specialization  : " + doctor.getSpecialization());
        System.out.println("Consultation fee: $" + doctor.getConsultationFee());
    }
}
