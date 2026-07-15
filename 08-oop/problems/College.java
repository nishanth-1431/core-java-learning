class Student {

    // Default access modifier
    String city = "Coimbatore";
}

public class College {

    public static void main(String[] args) {

        Student student = new Student();

        // Accessible because both classes are in the same package
        System.out.println("City : " + student.city);
    }
}