// Kyle Marlia-Conner
// 02/13/2025
// Assignment 8

import java.util.ArrayList;
import java.util.Scanner;

public class KyleArrayListTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers (enter 0 to stop and include it in the list):");

        while (true) {
            int num = scanner.nextInt();
            numbers.add(num);
            if (num == 0) {
                break;
            }
        }

        Integer largest = max(numbers);
        System.out.println("The largest value in the list is: " + largest);

        scanner.close();
    }

    public static Integer max(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }

        int max = list.get(0);
        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
