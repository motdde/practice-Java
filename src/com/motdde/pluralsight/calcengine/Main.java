package com.motdde.pluralsight.calcengine;

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
        } else if (args.length == 3)
            handleCommandLine(args);
        else
            System.out.println("Please provide an operation code and 2 numeric values");
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
                result = rightVal - rightVal;
                break;
            case 'm':
                result = rightVal * rightVal;
                break;
            case 'd':
                result = rightVal != 0 ? rightVal / rightVal : 0.0d;
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

    double valueFromWord(String word) {
        String[] numberWords = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                "ten" };
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
