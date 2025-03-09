// Kyle Marlia-Conner
// 03/08/2025
// Assignment 12

public class AutoServiceCost {

    // Standard service charge
    public static double yearlyService() {
        return 100.00;
    }

    // Standard service charge + Oil change fee
    public static double yearlyService(double oilChangeFee) {
        return 100.00 + oilChangeFee;
    }

    // Standard service charge + Oil change fee + Tire rotation charge
    public static double yearlyService(double oilChangeFee, double tireRotationFee) {
        return 100.00 + oilChangeFee + tireRotationFee;
    }

    // Standard service charge + Oil change fee + Tire rotation charge - Coupon discount
    public static double yearlyService(double oilChangeFee, double tireRotationFee, double couponDiscount) {
        return 100.00 + oilChangeFee + tireRotationFee - couponDiscount;
    }

    public static void main(String[] args) {
        // Test each method twice. Once at base price, then again with a $5 increase to service cost as well as coupon savings.

        // No parameters
        System.out.println("Test 1 - No extra services: $" + yearlyService());
        System.out.println("Test 2 - No extra services: $" + yearlyService());

        // One parameter (Oil change fee)
        System.out.println("Test 1 - Oil change ($25): $" + yearlyService(25.00));
        System.out.println("Test 2 - Oil change ($30): $" + yearlyService(30.00));

        // Two parameters (Oil change + Tire rotation)
        System.out.println("Test 1 - Oil change ($25) + Tire rotation ($40): $" + yearlyService(25.00, 40.00));
        System.out.println("Test 2 - Oil change ($30) + Tire rotation ($45): $" + yearlyService(30.00, 45.00));

        // Three parameters (Oil change + Tire rotation + Coupon discount)
        System.out.println("Test 1 - Oil change ($25) + Tire rotation ($40) - Coupon ($10): $" + yearlyService(25.00, 40.00, 10.00));
        System.out.println("Test 2 - Oil change ($30) + Tire rotation ($45) - Coupon ($15): $" + yearlyService(30.00, 45.00, 15.00));
    }
}
