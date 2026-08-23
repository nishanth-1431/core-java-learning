/*6. Ride Booking Application — Driver
A ride-booking application needs to maintain information about its drivers.
    Create a Driver class that stores:
        • Driver ID
        • Driver name
        • Phone number
        • Vehicle number
    Requirements:
        • Protect the driver's information from direct access.
        • Allow the application to read driver details.
        • Allow the driver's name, phone number, and vehicle number to be updated.
        • Display complete driver information.
        • Use the this keyword where appropriate.
*/
class Driver {
    private int driverId;
    private String driverName;
    private long phoneNumber;
    private String vehicleNumber;

    int getDriverId() {
        return driverId;
    }
    String getDriverName() {
        return driverName;
    }
    long getPhoneNumber() {
        return phoneNumber;
    }
    String getVehicleNumber() {
        return vehicleNumber;
    }

    void setDriverId(int driverId) {
        this.driverId = driverId;
    }
    void setDriverName(String driverName) {
        this.driverName = driverName;
    }
    void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
}

public class problem6 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.setDriverId(202);
        driver.setDriverName("Mike");
        driver.setPhoneNumber(9876543210L);
        driver.setVehicleNumber("AB-12-CD-3456");

        System.out.println("Driver ID      : " + driver.getDriverId());
        System.out.println("Name           : " + driver.getDriverName());
        System.out.println("Phone number   : " + driver.getPhoneNumber());
        System.out.println("Vehicle number : " + driver.getVehicleNumber());
    }
}
