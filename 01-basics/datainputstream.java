/*  Data Input Stream is used to read primitive data types from input stream.
Package:
import java.io.*;
 */
import java.io.*;
public class datainputstream {
    public static void main(String[] args)throws IOException {  // IOException is thrown because readLine() method can throw an IOException if an I/O error occurs.
        DataInputStream ip = new DataInputStream(System.in);
        System.out.print("plese enter your name: ");
        String name = ip.readLine();
        System.out.println("Hello " + name);
    }
}
/* Methods of DataInputStream
    readBoolean(): Reads a boolean value from the input stream.
    readByte(): Reads a byte value from the input stream.
    readChar(): Reads a character from the input stream.
    readDouble(): Reads a double value from the input stream.
    readFloat(): Reads a float value from the input stream.
    readInt(): Reads an integer value from the input stream.
    readLong(): Reads a long value from the input stream.
    readShort(): Reads a short value from the input stream.
 */
