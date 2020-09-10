package com.motdde.pluralsight.calcengine;

public abstract class CalculateBase {
    private double leftVal;
    private double rightVal;
    private double result;

    public CalculateBase(){}

    public CalculateBase(double leftVal, double rightVal) {
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }

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

    public abstract void calculate();

}
