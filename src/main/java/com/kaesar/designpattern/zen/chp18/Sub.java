package com.kaesar.designpattern.zen.chp18;

public class Sub implements Calculator3 {
    // 减法运算
    @Override
    public int exec(int a, int b) {
        return a - b;
    }
}
