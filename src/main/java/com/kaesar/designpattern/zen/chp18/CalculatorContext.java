package com.kaesar.designpattern.zen.chp18;

public class CalculatorContext {
    private Calculator3 cal = null;

    public CalculatorContext(Calculator3 _cal) {
        this.cal = _cal;
    }

    public int exec(int a, int b, String symbol) {
        return this.cal.exec(a, b);
    }
}
