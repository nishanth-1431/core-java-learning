/* 
Types of Arguments
Types:
No Arguments 
With Arguments

 */
public class arguments {
    static void withoutArguments(){  // function without arguments
        System.out.println("hello");
    }
    static void withArguments(String name){  // function with arguments
        System.out.println("hello " + name);
    }
    public static void main(String[] args){
        withoutArguments();           // calling function without arguments
        withArguments("john");  // calling function with arguments
    }
}