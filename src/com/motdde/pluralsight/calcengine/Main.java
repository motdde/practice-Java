package com.motdde.pluralsight.calcengine;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        double[] leftVals = { 100.0d, 25.0d, 255.0d, 11.0d };
        double[] rightVals = { 50.0d, 92.0d, 17.0d, 3.0d };
        char[] opCodes = { 'd', 'a', 's', 'm' };
        double[] results = new double[opCodes.length];

        if (args.length == 0) {
            for (int i = 0; i < opCodes.length; i++)
                results[i] = execute(opCodes[i], leftVals[i], rightVals[i]);

            for (double result : results)
                System.out.println(result);
        } else if (args.length == 1 && args[0].equals("interactive"))
            executeInteractively();
        else if (args.length == 3)
            handleCommandLine(args);
        else
            System.out.println("Please provide an operation code and 2 numeric values");
    }

    static void executeInteractively() {
        System.out.println("Enter an operation and two numbers:");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] parts = userInput.split(" ");
        performOperation(parts);
        scanner.close();
    }

    private static void performOperation(String[] parts) {
        char opCode = opCodeFromString(parts[0]);
        if (opCode == 'w')
            handleWhen(parts);
        else {
            double leftVal = valueFromWord(parts[1]);
            double rightVal = valueFromWord(parts[2]);
            double result = execute(opCode, leftVal, rightVal);
            displayResult(opCode, leftVal, rightVal, result);
        }
    }

    private static void handleWhen(String[] parts) {
        LocalDate startDate = LocalDate.parse(parts[1]);
        long daysToAdd = (long) valueFromWord(parts[2]);
        LocalDate newDate = startDate.plusDays(daysToAdd);
        String output = String.format("%s plus %d is %s", startDate, daysToAdd, newDate);
        System.out.println(output);
    }

    private static void displayResult(char opCode, double leftVal, double rightVal, double result) {
        char symbol = symbolFromOpcode(opCode);
        String output = String.format("%.3f %c %.3f = %.3f", leftVal, symbol, rightVal, result);
        System.out.println(output);
    }

    private static char symbolFromOpcode(char opCode) {
        char[] opCodes = { 'a', 's', 'm', 'd' };
        char[] sybmols = { '+', '-', '*', '/' };
        char symbol = ' ';
        for (int index = 0; index < opCodes.length; index++) {
            if (opCode == opCodes[index]) {
                symbol = sybmols[index];
                break;
            }
        }
        return symbol;

    }

    private static void handleCommandLine(String[] args) {
        char opCode = args[0].charAt(0);
        double leftVal = Double.parseDouble(args[1]);
        double rightVal = Double.parseDouble(args[1]);
        double result = execute(opCode, leftVal, rightVal);
        System.out.println(result);
    }

    static double execute(char opCode, double leftVal, double rightVal) {
        double result;
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            case 'd':
                result = rightVal != 0 ? leftVal / rightVal : 0.0d;
                break;
            default:
                System.out.println("Invaid opCode: " + opCode);
                result = 0.0d;
                break;
        }
        return result;
    }

    static char opCodeFromString(String operationName) {
        char opCode = operationName.charAt(0);
        return opCode;
    }

    static double valueFromWord(String word) {
        String[] numberWords = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        double value = 0d;
        for (int index = 0; index < numberWords.length; index++) {
            if (word.equals(numberWords[index])) {
                value = index;
                break;
            }
        }
        return value;
    }

}
