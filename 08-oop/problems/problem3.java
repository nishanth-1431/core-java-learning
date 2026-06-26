/* 3. Mobile Phone
Create a Mobile class.
Fields:
- company
- price
- batteryPercentage
Methods:
- call()
- charge()
Create three Mobile objects and call different methods.
Topics Used:
- Objects
- Fields
- Methods
 */
class Mobile {
    String company;
    int price;
    int batteryPercentage;
    String call(){
        return "calling";
    }
    String charge(){
        return "charging";
    }
}
public class problem3 {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();
        Mobile m3 = new Mobile();
       
        m1.company = "Apple";
        m1.batteryPercentage = 97;
        m1.price=75000;

        m2.company="Samsung";
        m2.batteryPercentage=82;
        m2.price=52000;

        m3.company="Nothing";
        m3.batteryPercentage=79;
        m3.price=34000;

        System.out.println(
        "Company : " + m1.company +
        "\nPrice : Rs." + m1.price +
        "\nBattery : " + m1.batteryPercentage + "%" +
        "\nStatus : " + m1.call() +
        "\nCharging : " + m1.charge() +
        "\n------------------------------"
        );

        System.out.println(
        "Company : " + m2.company +
        "\nPrice : Rs." + m2.price +
        "\nBattery : " + m2.batteryPercentage + "%" +
        "\nStatus : " + m2.call() +
        "\nCharging : " + m2.charge() +
        "\n------------------------------"
        );

        System.out.println(
        "Company : " + m3.company +
        "\nPrice : Rs." + m3.price +
        "\nBattery : " + m3.batteryPercentage + "%" +
        "\nStatus : " + m3.call() +
        "\nCharging : " + m3.charge() +
        "\n------------------------------"
        );

    }
}
