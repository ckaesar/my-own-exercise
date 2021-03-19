package com.kaesar.designpattern.zen.chp26;

public class Client26_6 {
    public static void main(String[] args) {
        ILift2 lift2 = new Lift2();
        // 电梯的初始条件应该是停止状态
        lift2.setState(ILift2.STOPPING_STATE);
        // 首先是电梯门开启，人进去
        lift2.open();
        // 然后电梯门关闭
        lift2.close();
        // 再然后，电梯运行起来，向上或者向下
        lift2.run();
        // 最后到达目的地，电梯停下来
        lift2.stop();
    }
}
