package com.motdde.pluralsight.calcengine;

public class CalculateBase {
    private double leftVal;
    private double rightVal;
    private double result;

    public double getLeftVal() {
        return leftVal;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double getRigtVal() {
        return rightVal;
    }

    public void setRigtVal(double rigtVal) {
        this.rightVal = rigtVal;
    }

    public void setLeftVal(double leftVal) {
        this.leftVal = leftVal;
    }

    public void calculate() {
    }

}
