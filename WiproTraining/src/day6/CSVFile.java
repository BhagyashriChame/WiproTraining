package day6;
import java.io.BufferedReader;

import java.io.FileReader;
import java.io.File;
import java.io.IOException;

public class CSVFile {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Bhagyashri Chame\\Documents\\data.csv");

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");                // Split by comma

                for (String value : values) {
                    System.out.print(value + "\t");
                }
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV: " + e.getMessage());
        } finally {
            System.out.println("CSV reading done.");
        }
    }
}
