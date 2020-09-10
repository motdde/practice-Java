package com.motdde.pluralsight.calcengine;

public class Adder extends CalculateBase {

    @Override
    public void calculate(){
        double result = getLeftVal() + getRigtVal();
        setResult(result);
    }
    
}
