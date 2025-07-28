package day6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Filehandleprogram {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\Bhagyashri Chame\\Documents\\FileHandle.txt");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();

            while (line != null) {
                System.out.println("File Content: " + line);
                line = reader.readLine();
            }

            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found error");
        } catch (IOException e) {
            System.out.println("IO error occurred while reading the file");
        } finally {
            System.out.println("This is the complete execution");
        }
    }
}
