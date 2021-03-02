package tau.chapter3;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        int quota = 10;

        System.out.println("Enter the amount of sales you made this week");
        Scanner scanner =  new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if(sales >= quota) {
            System.out.println("Congrats! You've met your quota");
        } else{
            int salesShort = quota - sales;
            System.out.format("You did not make your quota. You were %d sales short", salesShort);
        }
    }
}
