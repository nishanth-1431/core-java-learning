/*
Reading Files:

    Reading from a text file in Java is commonly done using classes like
    BufferedReader and FileReader. This helps read data line by line efficiently.

Core Methods (BufferedReader):

    1. readLine(): Reads a line of text. Returns null if the end of the stream has been reached.
    2. close(): Closes the stream and releases any system resources associated with it.

Syntax:

    try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            // Process line
        }
    }

Technical Explanation:

    • FileReader reads raw bytes and decodes them into characters.
    • BufferedReader wraps the FileReader to buffer characters, making reading much faster by reducing disk I/O.
    • Using try-with-resources automatically closes the readers, preventing memory leaks.

Important:

    Always handle IOException which can happen if the file is locked, unreadable, or doesn't exist.
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readingFiles {
    public static void main(String[] args) {
        String fileName = "sample.txt"; // Ensure this file exists for testing
        
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
