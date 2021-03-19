package com.kaesar.designpattern.zen.chp26;

/**
 * 电梯实现类
 */
public class Lift implements ILift {

    @Override
    public void open() {
        System.out.println("电梯门开启...");
    }

    @Override
    public void close() {
        System.out.println("电梯门关闭...");
    }

    @Override
    public void run() {
        System.out.println("电梯门上下运行起来...");
    }

    @Override
    public void stop() {
        System.out.println("电梯停止了...");
    }
}
