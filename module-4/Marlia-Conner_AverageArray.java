// Kyle Marlia-Conner
// 01/25/25
// Assignment 4

public class AverageArray {

    // Method to calculate average of short array
    public static short average(short[] array) {
        int sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short) (sum / array.length);
    }

    // Method to calculate average of int array
    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Method to calculate average of long array
    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Method to calculate average of double array
    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }
    
    // Main method to test the average methods
    public static void main(String[] args) {
        //  Arrays with different sizes
        short[] shortArray = {5, 12, 30};
        int[] intArray = {8, 17, 22, 36};
        long[] longArray = {100L, 150L, 225L, 300L, 450L};
        double[] doubleArray = {1.9, 2.5, 3.3, 4.1, 5.2, 6.5};

        // Display the averages and array contents
        System.out.println("Short Array: ");
        displayArray(shortArray);
        System.out.println("Average: " + average(shortArray));

        System.out.println("\nInt Array: ");
        displayArray(intArray);
        System.out.println("Average: " + average(intArray));

        System.out.println("\nLong Array: ");
        displayArray(longArray);
        System.out.println("Average: " + average(longArray));

        System.out.println("\nDouble Array: ");
        displayArray(doubleArray);
        System.out.println("Average: " + average(doubleArray));
    }

    // Display array contents
    public static void displayArray(Object array) {
        if (array instanceof short[]) {
            for (short num : (short[]) array) {
                System.out.print(num + " ");
            }
        } else if (array instanceof int[]) {
            for (int num : (int[]) array) {
                System.out.print(num + " ");
            }
        } else if (array instanceof long[]) {
            for (long num : (long[]) array) {
                System.out.print(num + " ");
            }
        } else if (array instanceof double[]) {
            for (double num : (double[]) array) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
