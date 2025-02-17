// Kyle Marlia-Conner
// 02/15/2025
// Assignment 9

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class FileM9 {
    public static void main(String[] args) {
        String fileName = "data.file";
        Random random = new Random();

        // Writing/Appending 10 random numbers to the file
        try (FileWriter fileWriter = new FileWriter(fileName, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            for (int i = 0; i < 10; i++) {
                int randomNumber = random.nextInt(100);
                bufferedWriter.write(randomNumber + " ");
            }
            bufferedWriter.newLine();
            System.out.println("10 random numbers added to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing the file.");
        }

        // Reading and displaying the file content
        System.out.println("\nContents of " + fileName + ":");
        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            while (fileScanner.hasNext()) {
                System.out.print(fileScanner.next() + " ");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
