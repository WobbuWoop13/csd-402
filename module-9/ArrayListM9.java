// Kyle Marlia-Conner
// 02/15/2025
// Assignment 9

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListM9 {
    public static void main(String[] args) {

        // Create an ArrayList with 10 Strings
        ArrayList<String> items = new ArrayList<>();
        items.add("Apple");
        items.add("Banana");
        items.add("Cherry");
        items.add("Orange");
        items.add("Blueberry");
        items.add("Strawberry");
        items.add("Grape");
        items.add("Honeydew");
        items.add("Watermelon");
        items.add("Kiwi");

        // Print the ArrayList using a for-each loop
        System.out.println("ArrayList Elements:");
        for (String item : items) {
            System.out.println(item);
        }

        // Ask user for an indexed item to display
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the index of the item you want to see (0-9): ");

        // User input as Integer
        Integer index = scanner.nextInt();

        // Try-Catch to handle out-of-bounds errors
        try {
            System.out.println("You selected: " + items.get(index));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception: Out of Bounds");
        }

        scanner.close();
    }
}
