package com.kaesar.designpattern.zen.chp26;

public class ConcreteState1 extends State {
    @Override
    public void handle1() {
        // 本状态必须处理的逻辑
    }

    @Override
    public void handle2() {
        // 设置当前状态为state2
        super.context.setCurrentState(ChangeContext.STATE2);
        // 过渡到state2状态，由context实现
        super.context.handle2();
    }
}
