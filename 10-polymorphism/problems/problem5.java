/*Problem 5 – Temperature Converter (Method Overloading)
Create a TemperatureConverter class and overload the convert() method to convert:
•	Celsius to Fahrenheit
•	Fahrenheit to Celsius
•	Celsius to Kelvin

*/class TemperatureConverter {

    // Celsius to Fahrenheit
    double convert(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Fahrenheit to Celsius
    double convert(double fahrenheit, boolean flag) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Celsius to Kelvin
    double convert(double celsius, int option) {
        return celsius + 273.15;
    }
}

public class problem5 {
    public static void main(String[] args) {

        TemperatureConverter tc = new TemperatureConverter();

        System.out.println("25°C to Fahrenheit = " + tc.convert(25));
        System.out.println("98.6°F to Celsius = " + tc.convert(98.6, true));
        System.out.println("25°C to Kelvin = " + tc.convert(25, 1));
    }
}