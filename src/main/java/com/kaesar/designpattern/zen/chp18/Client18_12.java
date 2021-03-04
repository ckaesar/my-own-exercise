package com.kaesar.designpattern.zen.chp18;

public class Client18_12 {
    public static void main(String[] args) {
        // 输入的两个参数是数字
        int a = 10, b = 20;
        String symbol = "+";
        System.out.println("输入的参数为：" + a + " " + b + " " + symbol);
        // 生成一个运算器
        Calculator cal = new Calculator();
        System.out.println("运行结果为：" + a + symbol + b + "=" + cal.exec(a, b, symbol));
    }
}
