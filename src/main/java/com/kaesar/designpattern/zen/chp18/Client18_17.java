package com.kaesar.designpattern.zen.chp18;

public class Client18_17 {
    // 加符号
    private final static String ADD_SYMBOL = "+";
    // 减符号
    private final static String SUB_SYMBOL = "-";

    public static void main(String[] args) {
        int a = 10, b = 20;
        String symbol = "+";
        System.out.println("输入的参数是" + a + " " + b + " " + symbol);
        CalculatorContext context = null;
        if (symbol.equals(ADD_SYMBOL)) {
            context = new CalculatorContext(new Add());
        } else if (symbol.equals(SUB_SYMBOL)) {
            context = new CalculatorContext(new Sub());
        }
        System.out.println("运行结果为：" + a + symbol + b + "=" + context.exec(a, b, symbol));
    }
}
