package tau.chapter6;

public class PhoneBill {

    private int id;
    private double baseCost;
    private int numberOfAllottedMinutes;
    private int numberOfMinutesUsed;

    private static double costPerMinutes = .25;
    private static double taxPercentage = .15;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public int getNumberOfAllottedMinutes() {
        return numberOfAllottedMinutes;
    }

    public void setNumberOfAllottedMinutes(int numberOfAllottedMinutes) {
        this.numberOfAllottedMinutes = numberOfAllottedMinutes;
    }

    public int getNumberOfMinutesUsed() {
        return numberOfMinutesUsed;
    }

    public void setNumberOfMinutesUsed(int numberOfMinutesUsed) {
        this.numberOfMinutesUsed = numberOfMinutesUsed;
    }

    PhoneBill() {
        this.id = 0;
        this.baseCost = 80.0;
        this.numberOfAllottedMinutes = 800;
        this.numberOfMinutesUsed = 800;
    }

    PhoneBill(int id) {
        this.id = id;
        this.baseCost = 80.0;
        this.numberOfAllottedMinutes = 800;
        this.numberOfMinutesUsed = 800;
    }

    public PhoneBill(int id, double baseCost, int numberOfAllottedMinutes, int numberOfMinutesUsed) {
        this.id = id;
        this.baseCost = baseCost;
        this.numberOfAllottedMinutes = numberOfAllottedMinutes;
        this.numberOfMinutesUsed = numberOfMinutesUsed;
    }

    public void printPhoneBill() {
        double overage = calculateOverage();
        double tax = calculateTax();
        double total = baseCost + overage + tax;

        System.out.println("Phone Bill Statement");
        System.out.printf("ID: #%d \n", id);
        System.out.printf("Plan: $%.2f \n", baseCost);
        System.out.printf("Overage: $%.2f \n", overage);
        System.out.printf("Tax: $%.2f \n", tax);
        System.out.printf("Total: $%.2f \n", total);
    }

    public double calculateTax() {
        double costBeforeTax = baseCost + calculateOverage();
        return costBeforeTax * taxPercentage;
    }

    public double calculateOverage() {
        if (numberOfMinutesUsed <= numberOfAllottedMinutes) return 0;
        return (numberOfMinutesUsed - numberOfAllottedMinutes) * costPerMinutes;
    }
}
