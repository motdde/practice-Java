package com.motdde.pluralsight.calcengine;

public class MathEquation {

    double leftVal;
    double rightVal;
    char opCode;
    double result;

    void execute() {
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
    }

}
