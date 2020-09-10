package com.motdde.pluralsight.calcengine;

public class Subtracter extends CalculateBase {
    @Override
    public void calculate() {
        double result = getLeftVal() - getRigtVal();
        setResult(result);
    }
}
