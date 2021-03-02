package tau.chapter3;

import java.util.Scanner;

public class LogicalOperatorLoanQualifier {
    public static void main(String[] args) {
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary");
        double salary = scanner.nextDouble();

        System.out.println("Enter the  number of years with your current employer");
        double years = scanner.nextDouble();

        scanner.close();

        if (salary >= requiredSalary && years >= requiredYearsEmployed) {
            System.out.printf("Congrats! You qualify for the loan");
        } else {
            System.out.printf("Sorry, you must earn at least $ %d to qualify for the loan", requiredSalary);
        }
    }
}
