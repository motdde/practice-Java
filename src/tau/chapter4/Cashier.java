package tau.chapter4;

import java.util.Scanner;

public class Cashier {
    public static String ordinal(int i) {
        String[] suffixes = new String[] { "th", "st", "nd", "rd", "th", "th", "th", "th", "th", "th" };
        return switch (i % 100) {
            case 11, 12, 13 -> i + "th";
            default -> i + suffixes[i % 10];
        };
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of items you would like to scan:");
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();

        double total = 0;

        for (int i = 1; i <= quantity; i++) {
            System.out.printf("Enter the cost of the %s item \n", ordinal(i));
            double price = scanner.nextDouble();
            total = total + price;
        }

        scanner.close();

        System.out.printf("Your total is $%f", total);
    }
}
