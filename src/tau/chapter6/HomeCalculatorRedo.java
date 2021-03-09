package tau.chapter6;

import java.util.Scanner;

public class HomeCalculatorRedo {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        HomeCalculatorRedo calculator = new HomeCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathroom = calculator.getRoom();

        double area = calculator.calculateTotalArea(kitchen, bathroom);
        System.out.printf("The total area is: %f", area);
        scanner.close();
    }

    private double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2) {
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }

    public Rectangle getRoom() {


        System.out.println("Enter the length of your room:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room:");
        double width = scanner.nextDouble();


        return new Rectangle(length, width);


    }
}
