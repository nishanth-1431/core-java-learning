/*  Nested if statement is a control flow statement that allows you
 to execute a block of code if a specified condition is true,
 and another block of code if the condition is false. 
 It is used when you want to check multiple conditions and
  execute different blocks of code based on the results of those conditions.
    Syntax :
if(condition1){
  // code to be executed if condition1 is true
    if(condition2){
        // code to be executed if condition2 is true
        }
    else{
        // code to be executed if condition2 is false
        }
    }
 */

public class nestedif_statement {
    public static void main(String[] args){
        String username = "admin";
        String password = "password123";
        if(username.equals("admin")){                              // only execute when the username is "admin"
            if(password.equals("password123")){                    // only execute when the password is "password123"
                System.out.println("Login successful");
            }
            else{                                                           // only execute when the password is not "password123"
                System.out.println("Incorrect password");
            }
        }
        else{                                                               // only execute when the username is not "admin"
            System.out.println("Incorrect username");
        }
    }
}
 