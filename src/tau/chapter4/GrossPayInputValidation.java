package tau.chapter4;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {
        int rate = 15;
        int minHours = 1;
        int maxHours = 40;

        System.out.println("How many hours did you work this week");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        //Remember to update the sentinel inside of your loop
        while (hoursWorked > maxHours || hoursWorked < minHours) {
            System.out.println("Invalid entry. Your hours worked must be between 1 and 40. Try again.");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();

        double gross = hoursWorked * rate;
        System.out.printf("You gross pay is: %f", gross);
    }
}
