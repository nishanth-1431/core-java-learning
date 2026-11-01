/* Switch statement is a control flow statement that allows you to execute different blocks of code based on the value of a variable. It is used as an alternative to multiple if-else statements when you have multiple conditions to check.
    Syntax :
switch(expression){
    case value1:
        // code to be executed if expression equals value1
        break;
    case value2:
        // code to be executed if expression equals value2
        break;
    default:
        // code to be executed if expression does not match any case
}
 */
public class switch_statement {
    public static void main(String[] args){
        int choice = 2;
        switch(choice){
            case 1:
                System.out.println("You selected option 1");
                break;
            case 2:
                System.out.println("You selected option 2");
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}
/* default case is optional. If no case matches and default case is not present, then no action will be taken.
 */
