// Kyle Marlia-Conner
// 02/02/2025
// Assignment 6.2

public class Fan {
    // Constants representing fan speeds
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // No-argument constructor (default values)
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6.0;
        this.color = "white";
    }

    // Constructor with arguments
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getter and Setter for speed
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Getter and Setter for on
    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    // Getter and Setter for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter and Setter for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString method without @Override annotation
    public String toString() {
        if (on) {
            return "Fan is ON - Speed: " + speed + ", Radius: " + radius + ", Color: " + color;
        } else {
            return "Fan is OFF - Radius: " + radius + ", Color: " + color;
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating fan using default constructor
        Fan defaultFan = new Fan();
        System.out.println("Default Fan: " + defaultFan);

        // Creating fan using parameterized constructor
        Fan customFan = new Fan(Fan.FAST, true, 10.5, "blue");
        System.out.println("Custom Fan: " + customFan);

        // Demonstrating setter methods
        defaultFan.setOn(true);
        defaultFan.setSpeed(Fan.MEDIUM);
        defaultFan.setRadius(8.0);
        defaultFan.setColor("red");

        System.out.println("Updated Default Fan: " + defaultFan);
    }
}
