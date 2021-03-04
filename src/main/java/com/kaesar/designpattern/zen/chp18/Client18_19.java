package com.kaesar.designpattern.zen.chp18;

public class Client18_19 {
    public static void main(String[] args) {
        int a = 10, b = 20;
        String symbol = "+";
        System.out.println("输入的参数是" + a + " " + b + " " + symbol);
        System.out.println("运行结果为：" + a + symbol + b + "=" + CalculatorEnum.ADD.exec(a, b));
    }

}
