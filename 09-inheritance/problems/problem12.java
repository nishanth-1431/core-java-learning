/* 12. Hospital Management
Topics Used: Multilevel Inheritance
Hierarchy: Person → Doctor → Surgeon
Person
  Fields:    one field
  Methods:   one method
Doctor
  Fields:    one field
  Methods:   one method
Surgeon
  Fields:    one field
  Methods:   one method
Note: Create one Surgeon object and access everything.
 */
class Person{
    String name ;
    void showDetails(){
        System.out.println("Person name  : "+name);
    }
}
class Doctor extends Person{
    String diagnosis;
    void showDiagnosis(){
        System.out.println("Diagnosis    : "+diagnosis);
    }
}
class Surgeon extends Doctor{
    String surgeryType;
    void showSurgery(){
        System.out.println("Surgery Type : "+surgeryType);
    }
}

public class problem12 {
    public static void main(String[] args) {
        Surgeon s1 = new Surgeon();
        s1.name = "john";
        s1.diagnosis = "Appendicitis";
        s1.surgeryType="Appendectomy";

        s1.showDetails();
        s1.showDiagnosis();
        s1.showSurgery();
    }
}
