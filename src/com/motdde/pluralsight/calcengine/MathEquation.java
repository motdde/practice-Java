package com.motdde.pluralsight.calcengine;



public class MathEquation {

    private double leftVal;
    private double rightVal;
    private char opCode;
    private double result;

    private static int numberOfCalculations;
    private static double sumOfResults;

    public MathEquation() {
    }

    public MathEquation(char opCode) {
        this.opCode = opCode;
    }

    public MathEquation(char opCode, double leftVal, double rightVal) {
        this(opCode); // Constructor chaining
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

    public void execute() {
        switch (opCode) {
            case 'a':
                setResult(leftVal + rightVal);
                break;
            case 's':
                setResult(leftVal - rightVal);
                break;
            case 'm':
                setResult(leftVal * rightVal);
                break;
            case 'd':
                setResult(rightVal != 0 ? leftVal / rightVal : 0.0d);
                break;
            default:
                System.out.println("Invaid opCode: " + opCode);
                setResult(0.0d);
                break;
        }
        numberOfCalculations++;
        sumOfResults += result;
    }

    public static double getAverageResult() {
        return sumOfResults / numberOfCalculations;
    }

    public double getResult() {
        return result;
    }

    private void setResult(double result) {
        this.result = result;
    }

    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    public void setRightVal(double rightVal) {
        this.rightVal = rightVal;
    }

    public void setOpCode(char opCode) {
        this.opCode = opCode;
    }

}
