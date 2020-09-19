package com.motdde.pluralsight.calcengine;

public class Adder extends CalculateBase implements MathProcessing {

    public Adder() {
    }

    public Adder(double leftVal, double rightVal) {
        super(leftVal, rightVal);
    }

    @Override
    public void calculate() {
        double result = getLeftVal() + getRigtVal();
        setResult(result);
    }

    @Override
    public String getKeyWord() {
        return "add";
    }

    @Override
    public double doCalculation(double leftVal, double rightVal) {
        setLeftVal(leftVal);
        setRigtVal(rightVal);
        calculate();
        return getResult();
    }

}
