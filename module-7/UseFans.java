// Kyle Marlia-Conner
// 02/09/2025
// Assignment 7.2

import java.util.ArrayList;

public class UseFans {
    public static void main(String[] args) {
        ArrayList<Fan> fanCollection = new ArrayList<>();

        fanCollection.add(new Fan());
        fanCollection.add(new Fan(Fan.FAST, true, 10.5, "blue"));
        fanCollection.add(new Fan(Fan.SLOW, false, 7.5, "red"));
        fanCollection.add(new Fan(Fan.MEDIUM, true, 12.0, "green"));

        System.out.println("Displaying all fans in the collection:");
        displayFans(fanCollection);

        System.out.println("\nDisplaying a single fan:");
        displaySingleFan(fanCollection.get(1));
    }

    public static void displayFans(ArrayList<Fan> fans) {
        for (Fan fan : fans) {
            fan.displayFan();
        }
    }

    public static void displaySingleFan(Fan fan) {
        fan.displayFan();
    }
}
