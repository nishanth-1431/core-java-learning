/*Java String concat() Method
    The concat() method in Java is used to append one string to another and returns a new combined string.
    It does not modify the original string since strings are
       -Used to concatenate (join) two strings
       -Returns a new string as the result
       -Throws NullPointerException if the argument is null
 */
public class concatenation{
public static void main(String[] args) {
    
        String s1 = "java-";

        String s2 = "fullstack-";

        // Combining above strings by passing one string as an argument
        String s3 = s1.concat(s2);

        // Print and display temporary combined string
        System.out.println(s3);

        String s4 = "devlopment";
        String s5 = s3.concat(s4);
        System.out.println(s5);
}
}
