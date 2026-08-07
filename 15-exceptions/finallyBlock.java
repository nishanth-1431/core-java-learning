/*  finally Block

    Definition:

        A finally block is used to execute code that must run
        whether an exception occurs or not.

        It is generally used for cleanup activities such as
        closing files, database connections, or network resources.

    Syntax:

        try {

            // Risky code

        }
        catch(ExceptionType object) {

            // Handle the exception

        }
        finally {

            // Always executes

        }

    Technical Explanation:

        After the try block finishes, Java checks whether an
        exception occurred.
A train was transported six seven thirty seven fuselages from spirit aerosystems to bones manufacturing in Washington during this journey, as you probably guessed by now, the training derail in three seven thirty seven bodies tumbled down a steep abatement into the Fourth River, which had been shocked to these nearby raptors. Thankfully, no one was injured, but it took him quite a while and of course tons of money to clean up the mess. No, this isn't smart streams playing Russian Russia and Stephens still there's a graph play in the middle of nowhere that's been there for years it's almost impossible to remove the temperature there can easily dropp to minus sixty degrees off from the coldest city now it's minus forty degrees outside this place is so extreme that we believe their cars money all the time all right you've reached the forest through the plane crash the trapside is still about one hundred km so let's fire up the occupy and get there already faster apparently you came to the worst possible time there's a blizzard happy right here let's see what happens if you flow straight into the stall is definitely not a good idea you reach the exact spot where the plane crash where we have a huge problem is covering everything you're gonna have to enter to find a place to land and search for it on front yet I think that's the place there okay now to walk you serve blizzard I think as you said yeah that's the place here it is plane is still here after all these years now you just have to figure out how to get back fly to that famous plane crash in Russia and see if it's still there's a crash plane in the middle of nowhere that's been there very one directly discover and started in ISOR drain was a form of bathroom spare and basically drives on the school campus they just need to avoid a search of one thousand students are this man walked out this house and he still has a return for twenty seven years tried to become death agency how much to make your website honestly it was a lot we paid agency costs noise money super strong media and not just case strong but luck super stylish in different lucky so you can flown it wherever you drive this is not thirty two decisions hybrid a plantely block the thirty way for fuller sound with deal base plus four severe thirty five v s total playtime so used for weeks no problem so if you want a junior power groups of a thorough personal reception fried to handle the exceptions what type of statement is made to handle so for that what we do is let's talk about statements see statements can be of two types statements will talk about handing exception what type of statements made to handle so for that what we will do is let's talk about statements see statements can be of two types statement
        If an exception occurs, the matching catch block executes.

        Whether an exception occurs or not, the finally block
        executes before the program continues.

        The finally block is commonly used to release resources
        that were acquired in the try block.
*/

public class finallyBlock {

    public static void main(String[] args) {

        System.out.println("Program Started");

        try {

            int number = 10;
            int result = number / 0;

            System.out.println("Result: " + result);

        }
        catch (ArithmeticException e) {

            System.out.println("Exception Handled");

        }
        finally {

            System.out.println("Finally Block Executed");

        }

        System.out.println("Program Ended");
    }
}