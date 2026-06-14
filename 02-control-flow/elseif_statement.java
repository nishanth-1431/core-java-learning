/* else if statement is used to test multiple conditions. 
It allows you to specify a new condition to test if the previous condition(s) were false.
Syntax :
if(condition1){
 // code to be executed if condition1 is true
  }
}
else if(condition2){
  // code to be executed if condition2 is true
  }
}
else{
    // code to be executed if all previous conditions are false
}

*/
public class elseif_statement {
    public static void main(String[] args){
        int number = 0;
        if(number>0){                                                   // only execute when the number is greater than 0
            System.out.println("The number is positive");
        }
        else if(number<0){                                              // only execute when the number is less than 0
            System.out.println("The number is negative");
        }
        else{                                                           // only execute when the number is equal to 0
            System.out.println("The number is zero");
        }
    }
    
}
