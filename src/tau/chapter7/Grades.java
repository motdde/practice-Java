package tau.chapter7;

import java.util.Scanner;

public class Grades {
    private static final Scanner scanner = new Scanner(System.in);
    private static int[] grades;

    public static void main(String[] args) {
        System.out.println("How many grades would you like to enter");
        grades = new int[scanner.nextInt()];

        getGrades();
        System.out.println("Sum " + calculateSum());
        System.out.println("Average: " + String.format("%.2f", calculateAverage()));
        System.out.println("Highest: " + getHighest());
        scanner.close();
    }

    private static double calculateAverage() {
        return (double) calculateSum() / grades.length;
    }

    public static int getHighest() {
        int highest = grades[0];
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    public static int calculateSum() {
        int sum = 0;
        for (int grade : grades) {
            sum = sum + grade;
        }
        return sum;
    }

    public static void getGrades() {
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter grade #" + (i + 1));
            grades[i] = scanner.nextInt();
        }
    }
}
