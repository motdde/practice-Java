package com.motdde.pluralsight.calcengine;

public class Divider extends CalculateBase {

    public Divider() {
    }

    public Divider(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        double result = getLeftVal() / getRigtVal();
        setResult(result);
    }
}
