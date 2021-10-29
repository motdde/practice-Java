package tau.chapter7;

import java.util.Scanner;

public class DayOfTheWeek {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day: ");
        int selectedDay = scanner.nextInt();
        System.out.println(getDayOfheWeek(selectedDay) + " is day " + selectedDay);
        scanner.close();
    }

    public static String getDayOfheWeek(int dayIndex) {
        final String[] week = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

        return week[dayIndex - 1];
    }
}
