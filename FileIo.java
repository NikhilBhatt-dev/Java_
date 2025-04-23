
// Importing required classes for file I/O operations
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIo {

    public static void main(String[] args) {

        // Try block to handle potential IOExceptions during file writing
        try {
            // Creating a BufferedWriter to write to a file named "output.txt"
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("write to a file");
            writer.write(" \n here i another line");

            writer.close();
        } catch (IOException e) {
            // Catch block to handle IOExceptions and print the stack trace
            e.printStackTrace();
        }

        // try block to handle file reading
        try {
            // Creating a BufferedReader to read from the file "output.txt"
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));

            // Declaring a variable to hold each line read from the file
            String line;

            // Loop to read each line until end of file (i.e., readLine() returns null)
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
