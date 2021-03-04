package com.kaesar.designpattern.zen.chp18;

public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("吴国太开绿灯，放行！");
    }
}
