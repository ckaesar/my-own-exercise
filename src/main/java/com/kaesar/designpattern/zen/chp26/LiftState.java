package com.kaesar.designpattern.zen.chp26;

public abstract class LiftState {
    // 定义一个环境橘色，也就是封装状态的变化引起的功能变化
    protected Context context;

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    // 首先电梯门开启动作
    public abstract void open();

    // 电梯门可以开启，那当然也有关闭了
    public abstract void close();

    // 电梯要能上能下
    public abstract void run();

    // 电梯还要能停下来
    public abstract void stop();
}
