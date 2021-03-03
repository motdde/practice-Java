package tau.chapter4;

import java.util.Scanner;

public class AverageTestScore {
    public static void main(String[] args) {
        int numberOfStudents = 24;
        int numberOfTests = 4;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numberOfStudents; i++) {
            double total = 0;
            for (int j = 0; i < numberOfTests; i++) {
                System.out.printf("Enter the test score for #%d", (j + 1));
                double score = scanner.nextDouble();
                total = total + score;
            }
            double average = total / numberOfTests;
            System.out.printf("The test average or students #%d is %f", (i + 1), average);

        }
        scanner.close();
    }
}
