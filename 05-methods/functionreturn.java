
public class functionreturn {
    static int add(){  // function that returns an integer value
        int a = 10;    // local variable 
        int b = 5;     // local variable
        return a+b;    // return the sum of a and b
    }
    public static void main(String[] args){
        int result = add();                     // call the add function and store the returned value in result
        System.out.println(result);
    }
}
