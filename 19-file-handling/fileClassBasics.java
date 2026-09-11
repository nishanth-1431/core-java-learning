/*
File Class:

    The File class in the java.io package represents a file or directory path name abstractly.
    It's used to check properties, create, delete, or rename files and directories.

Core Methods:

    1. exists(): Tests whether the file or directory exists.
    2. createNewFile(): Atomically creates a new, empty file if it doesn't already exist.
    3. length(): Returns the length of the file in bytes.
    4. delete(): Deletes the file or directory.

Syntax:

    File myFile = new File("data.txt");
    if (myFile.exists()) {
        System.out.println("Size: " + myFile.length());
    } else {
        myFile.createNewFile();
    }

Technical Explanation:

    • Creating a File object does not actually create a file on the disk; it just creates an object in memory.
    • It only manages metadata (path, permissions, size), not the actual reading or writing of file content.
    • Can be used to list contents of a directory using listFiles().

Important:

    With modern Java (NIO.2), the java.nio.file.Files and Path classes are often preferred for these operations.
*/
import java.io.File;
import java.io.IOException;

public class fileClassBasics {
    public static void main(String[] args) {
        File myFile = new File("sample.txt");
        
        try {
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
        if (myFile.exists()) {
            System.out.println("File name: " + myFile.getName());
            System.out.println("Absolute path: " + myFile.getAbsolutePath());
            System.out.println("Writeable: " + myFile.canWrite());
            System.out.println("Readable: " + myFile.canRead());
            System.out.println("File size in bytes: " + myFile.length());
        }
    }
}
