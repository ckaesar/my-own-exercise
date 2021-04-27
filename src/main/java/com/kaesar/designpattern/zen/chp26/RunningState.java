package com.kaesar.designpattern.zen.chp26;

public class RunningState extends LiftState {
    // 运行时候开电梯门？疯了！电梯不能打开
    @Override
    public void open() {
        // do nothing
    }

    // 电梯门关闭？这是肯定的
    @Override
    public void close() {
        // do nothing
    }

    // 这是在运行状态下要实现的方法
    @Override
    public void run() {
        System.out.println("电梯上下运行...");
    }

    // 这绝对是合理的，只运行不停止还有谁敢坐这个电梯？
    @Override
    public void stop() {
        super.context.setLiftState(Context.stoppingState); // 环境设置为停止状态
        super.context.getLiftState().stop();
    }
}
