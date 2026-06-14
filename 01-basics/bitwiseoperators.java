 /* Bitwise Operators  */
 
 public class bitwiseoperators {
    public static void main(String[] args){
        int a=5;     // In binary: 0101
        int b=3;     // In binary: 0011
        int c=a&b;   // Bitwise AND
        int d=a|b;   // Bitwise OR
        int e=a^b;   // Bitwise XOR
        int f=~a;    // Bitwise NOT
        int g=a<<1;  // Left shift
        int h=a>>1;  // Right shift
        System.out.println("Bitwise AND: " + c);  // 1 (0001)
        System.out.println("Bitwise OR: " + d);   // 7 (0111
        System.out.println("Bitwise XOR: " + e);  // 6 (0110)
        System.out.println("Bitwise NOT: " + f);  // -6 (in 32-bit representation)
        System.out.println("Left Shift: " + g);   // 10 (1010)
        System.out.println("Right Shift: " + h);  // 2 (0010) 
    }
}
/* 
    Bitwise Operators:
    1. Bitwise AND (&): Compares each bit of two integers and returns 1 if both bits are 1, otherwise returns 0.
    2. Bitwise OR (|): Compares each bit of two integers and returns 1 if at least one of the bits is 1, otherwise returns 0.
    3. Bitwise XOR (^): Compares each bit of two integers and returns 1 if the bits are different, otherwise returns 0.
    4. Bitwise NOT (~): Inverts the bits of an integer (0 becomes 1 and 1 becomes 0).
    5. Left Shift (<<): Shifts the bits of an integer to the left by a specified number of positions, filling with zeros on the right.
    6. Right Shift (>>): Shifts the bits of an integer to the right by a specified number of positions, filling with the sign bit on the left for signed integers.
 */
