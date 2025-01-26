// Kyle Marlia-Conner
// 01/25/25
// Assignment 3

public class TreePattern {
    public static void main(String[] args) {
        int rows = 7; // Number of rows
        int maxWidth = 45; // Total width

        for (int i = 0; i < rows; i++) {
            StringBuilder row = new StringBuilder();

            // Generate leading spaces
            for (int j = 0; j < rows - i - 1; j++) {
                row.append("  "); // Two spaces for each step
            }

            // Generate the left side of the numbers
            int value = 1;
            for (int j = 0; j <= i; j++) {
                row.append(value).append(" ");
                value *= 2; // Double the value
            }

            // Generate the right side of the numbers
            value /= 2; 
            for (int j = i - 1; j >= 0; j--) {
                value /= 2; // Halve the value
                row.append(value).append(" ");
            }

            // Calculate remaining spaces to align @ symbol
            while (row.length() < maxWidth) {
                row.append(" ");
            }

            // Add the @ symbol at the end
            row.append("@");

            // Print the row
            System.out.println(row);
        }
    }
}
