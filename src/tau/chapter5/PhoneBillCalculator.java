package tau.chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {

    private static final Scanner scanner = new Scanner(System.in);

    static double costPerMinutes = .25;
    static double taxPercentage = .15;

    public static void main(String[] args) {
        double baseCost = getBaseCost();
        int overageMinutes = getOverageMinutes();
        scanner.close();

        double overage = calculateOverage(overageMinutes, costPerMinutes);
        double tax = calculateTax(baseCost, overage, taxPercentage);
        printPhoneBill(baseCost, overage, tax);

    }

    private static void printPhoneBill(double baseCost, double overage, double tax) {
        double total = baseCost + overage + tax;

        System.out.println("Phone Bill Statement");
        System.out.printf("Plan: $%.2f \n", baseCost);
        System.out.printf("Overage: $%.2f \n", overage);
        System.out.printf("Tax: $%.2f \n", tax);
        System.out.printf("Total: $%.2f \n", total);
    }

    private static double calculateTax(double baseCost, double overage, double taxPercentage) {
        double costBeforeTax = baseCost + overage;
        return costBeforeTax * taxPercentage;
    }

    private static double calculateOverage(int overageMinutes, double costPerMinutes) {
        return overageMinutes * costPerMinutes;
    }

    private static int getOverageMinutes() {
        System.out.println("Enter overage minutes:");
        return scanner.nextInt();
    }

    private static double getBaseCost() {
        System.out.println("Enter base cost of the plan:");
        return scanner.nextDouble();
    }
}
