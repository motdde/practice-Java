package tau.chapter4;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean again;
        do {
            System.out.println("Enter the first number");
            double num1 = scanner.nextDouble();

            System.out.println("enter the second number");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;
            System.out.printf("%f + %f = %f \n", num1, num2, sum);

            System.out.println("Do you want to try again? Enter true/false");
            again = scanner.nextBoolean();
        } while (again); //Be sure to update the sentinel in the loop
        scanner.close();
    }
}
