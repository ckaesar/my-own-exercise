package com.kaesar.designpattern.zen.chp26;

public class ConcreteState2 extends State {
    @Override
    public void handle1() {
        // 设置当前状态为state1
        super.context.setCurrentState(ChangeContext.STATE1);
        // 过渡到state1状态，有context实现
        super.context.handle1();
    }

    @Override
    public void handle2() {
        // 本状态下必须处理的逻辑
    }
}
