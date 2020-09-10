package com.motdde.pluralsight.calcengine;

public class Divider extends CalculateBase {
    @Override
    public void calculate() {
        double result = getLeftVal() / getRigtVal();
        setResult(result);
    }
}
