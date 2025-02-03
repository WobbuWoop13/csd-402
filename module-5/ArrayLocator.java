// Kyle Marlia-Conner
// 02/02/2025
// Assignment 5.2

public class ArrayLocator {

    // Method to find the location of the largest element in a 2D double array
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = {0, 0};
        double max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Method to find the location of the largest element in a 2D int array
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = {0, 0};
        int max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Method to find the location of the smallest element in a 2D double array
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = {0, 0};
        double min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Method to find the location of the smallest element in a 2D int array
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = {0, 0};
        int min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    public static void main(String[] args) {
        // Example usage
        int[][] intArray = {
            {3, 5, 9},
            {1, 8, 2},
            {6, 4, 7}
        };

        double[][] doubleArray = {
            {2.5, 7.1, 9.3},
            {6.8, 3.2, 1.4},
            {5.5, 8.9, 4.0}
        };

        int[] largestInt = locateLargest(intArray);
        int[] smallestInt = locateSmallest(intArray);
        int[] largestDouble = locateLargest(doubleArray);
        int[] smallestDouble = locateSmallest(doubleArray);

        System.out.println("Largest int located at: [" + largestInt[0] + ", " + largestInt[1] + "]");
        System.out.println("Smallest int located at: [" + smallestInt[0] + ", " + smallestInt[1] + "]");
        System.out.println("Largest double located at: [" + largestDouble[0] + ", " + largestDouble[1] + "]");
        System.out.println("Smallest double located at: [" + smallestDouble[0] + ", " + smallestDouble[1] + "]");
    }
}
