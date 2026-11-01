/*
Writing and Appending to Files:

    FileWriter is used to write streams of characters to a file. 
    It can overwrite an existing file or append new data to the end of it.

Core Methods (FileWriter):

    1. write(String str): Writes a string to the file.
    2. append(CharSequence csq): Appends a character sequence.
    3. close(): Flushes the stream and closes it.

Syntax:

    // Overwrite mode
    try (FileWriter writer = new FileWriter("file.txt")) {
        writer.write("Hello World");
    }

    // Append mode
    try (FileWriter writer = new FileWriter("file.txt", true)) {
        writer.write("Appended Text");
    }

Technical Explanation:

    • Passing 'true' as the second argument to FileWriter's constructor turns on append mode.
    • Data might not be written to disk immediately; it's buffered. Closing or flushing the writer ensures it's saved.
    • Overwriting will erase all existing content in the file upon opening it.

Important:

    Just like reading, always wrap writers in try-with-resources to ensure the file is closed properly.
*/
import java.io.FileWriter;
import java.io.IOException;

public class writingAndAppending {
    public static void main(String[] args) {
        String fileName = "sample.txt";
        
        // Writing to a file (overwrites)
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("This is the first line.\n");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Appending to a file
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("This is an appended line.\n");
            System.out.println("Successfully wrote and appended to file.");
        } catch (IOException e) {
            System.out.println("Error appending to file: " + e.getMessage());
        }
    }
}
