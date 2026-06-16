/*
String Methods

String methods are functions that come with the String class.
They help us perform different operations on strings.

Some common methods:

length()             -> gives the length of the string
charAt()             -> gives a character at a specific index
equals()             -> compares two strings
equalsIgnoreCase()   -> compares strings ignoring case
toUpperCase()        -> converts to uppercase
toLowerCase()        -> converts to lowercase
substring()          -> gets part of a string
contains()           -> checks if text exists in a string
indexOf()            -> finds the position of a character or word
replace()            -> replaces characters or words
trim()               -> removes extra spaces from beginning and end

Note:
Strings are immutable, so methods like replace(),
trim() and toUpperCase() do not change the original string.
They return a new string.
*/

public class stringmethods {

    public static void main(String[] args) {

        String str = " Full Stack Java ";

        System.out.println("Original String : " + str);

        System.out.println("Length          : " + str.length());

        System.out.println("Character at 1  : " + str.charAt(1));

        System.out.println("Upper Case      : " + str.toUpperCase());

        System.out.println("Lower Case      : " + str.toLowerCase());

        System.out.println("Trim            : " + str.trim());

        System.out.println("Contains Java   : " + str.contains("Java"));

        System.out.println("Index of J      : " + str.indexOf('J'));

        System.out.println("Replace Java    : "
                + str.replace("Java", "Developer"));

        System.out.println("Substring       : "
                + str.substring(1, 5));

        String s1 = "Java";
        String s2 = "java";

        System.out.println("equals          : "
                + s1.equals(s2));

        System.out.println("equalsIgnoreCase: "
                + s1.equalsIgnoreCase(s2));
    }
}
