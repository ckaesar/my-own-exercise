package com.kaesar.designpattern.zen.chp18;

public class Add implements Calculator3 {
    // 加法运算
    @Override
    public int exec(int a, int b) {
        return a + b;
    }
}
