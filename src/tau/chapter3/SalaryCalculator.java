package tau.chapter3;

/*
IF Statement
All salespeople get a payment of $1000 a week.
Sales people who exceed 10 sales he an additional bonus of $250.
 */

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        System.out.println("How many sales did the employee make this week:");
        Scanner scanner =  new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if(sales > quota) {
            salary = salary + bonus;
        }

        System.out.println("The employee's pay is $" + salary);
    }



}
