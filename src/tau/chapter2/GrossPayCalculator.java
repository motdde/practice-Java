package tau.chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] arg) {

        // get the number of hours
        System.out.println("Enter the number of hours the employee worked.");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        // get the hourly pay rate
        System.out.println("Enter the employees pay rate.");
        double rate = scanner.nextDouble();
        scanner.close();

        // Multiply hours and pay rate
        double grossPay = hours * rate;

        // display result
        System.out.println("The employees gross pay is $" + grossPay);
    }
}
