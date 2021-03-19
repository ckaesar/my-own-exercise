package com.kaesar.designpattern.zen.chp26;

/**
 * 电梯接口
 */
public interface ILift {
    // 首先电梯门开启动作
    public void open();

    // 电梯门可以开启，那当然也有关闭了
    public void close();

    // 电梯要能上能下
    public void run();

    // 电梯还要能停下来
    public void stop();
}
