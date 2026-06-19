/*for each loop :
   - This loop is used to iterate over arrays or collections.
   Syntax :
     for (dataType variable : arrayOrCollection) {
    // code to be executed
    }
*/
public class for_each {
    public static void main(String[] args)
    {
        String[] names = { "jeff", "elon", "sundar" };

        for (String name : names) {
            System.out.println("Name: " + name);
        }
    }
}

