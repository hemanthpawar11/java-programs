import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingExample {
    public static void main(String[] args) {
        try {
            // 1️⃣ Create a new file
            File myFile = new File("example.txt");
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }

            // 2️⃣ Write to the file
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, this is an example of file handling in Java!\n");
            writer.write("We are writing multiple lines into the file.");
            writer.close();
            System.out.println("Successfully wrote to the file.");

            // 3️⃣ Read from the file
            Scanner reader = new Scanner(myFile);
            System.out.println("\nFile contents:");
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();

            // 4️⃣ Get file information
            System.out.println("\nFile Information:");
            if (myFile.exists()) {
                System.out.println("File name: " + myFile.getName());
                System.out.println("Absolute path: " + myFile.getAbsolutePath());
                System.out.println("Writable: " + myFile.canWrite());
                System.out.println("Readable: " + myFile.canRead());
                System.out.println("File size (bytes): " + myFile.length());
            }

            // 5️⃣ Delete the file (optional)
            // if (myFile.delete()) {
            //     System.out.println("Deleted the file: " + myFile.getName());
            // } else {
            //     System.out.println("Failed to delete the file.");
            // }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
