/*  Wrapper Class Methods

    Definition:

        Wrapper classes provide useful methods for converting,
        parsing, comparing, and working with primitive values.

        These methods are commonly useful when processing data
        received as Strings from users, forms, APIs, files,
        and databases.

    Commonly Used Methods:

        Integer.parseInt()
            Converts a String into an int.

        Double.parseDouble()
            Converts a String into a double.

        Integer.valueOf()
            Converts a String or primitive value into an Integer object.

        Integer.toString()
            Converts an Integer value into a String.

        compareTo()
            Compares two wrapper objects.

        Character.isLetter()
            Checks whether a character is a letter.

        Character.isDigit()
            Checks whether a character is a digit.

        Character.isUpperCase()
            Checks whether a character is uppercase.

        Character.isLowerCase()
            Checks whether a character is lowercase.

        Character.toUpperCase()
            Converts a character to uppercase.

        Character.toLowerCase()
            Converts a character to lowercase.

        Boolean.parseBoolean()
            Converts a String into a boolean.

        Boolean.valueOf()
            Converts a String into a Boolean object.

    Technical Explanation:

        Web applications frequently receive data as Strings.

        Wrapper class methods can convert that String data into
        the required Java data type.

        Example:

            String ageText = "19";

            int age = Integer.parseInt(ageText);

        Here, the String "19" is converted into the int value 19.
*/

public class wrapperMethods {

    public static void main(String[] args) {

        String numberText = "100";
        int number = Integer.parseInt(numberText); // String → int
        System.out.println("Parsed number: " + number);

        Integer numberObject = Integer.valueOf(numberText); // String → Integer
        System.out.println("Integer object: " + numberObject);

        String convertedNumber = numberObject.toString(); // Integer → String
        System.out.println("String value: " + convertedNumber);

        String priceText = "99.99";
        double price = Double.parseDouble(priceText); // String → double
        System.out.println("Parsed price: " + price);

        Double priceObject = Double.valueOf(priceText); // String → Double
        System.out.println("Double object: " + priceObject);

        String idText = "123456789";
        long id = Long.parseLong(idText); // String → long
        System.out.println("Parsed ID: " + id);

        Long idObject = Long.valueOf(idText); // String → Long
        System.out.println("Long object: " + idObject);

        String statusText = "true";
        boolean status = Boolean.parseBoolean(statusText); // String → boolean
        System.out.println("Parsed boolean: " + status);

        Boolean statusObject = Boolean.valueOf(statusText); // String → Boolean
        System.out.println("Boolean object: " + statusObject);

        char character = 'A';

        System.out.println("Is letter: " + Character.isLetter(character));
        System.out.println("Is digit: " + Character.isDigit(character));
        System.out.println("Is uppercase: " + Character.isUpperCase(character));
        System.out.println("Is lowercase: " + Character.isLowerCase(character));

        System.out.println("Uppercase: " + Character.toUpperCase('a'));
        System.out.println("Lowercase: " + Character.toLowerCase('A'));
    }
}