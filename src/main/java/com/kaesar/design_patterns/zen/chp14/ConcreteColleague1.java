package com.kaesar.design_patterns.zen.chp14;

public class ConcreteColleague1 extends Colleague {
    // 通过构造函数传递中介者
    public ConcreteColleague1(MediatorCommon _mediatorCommon) {
        super(_mediatorCommon);
    }

    // 自有方法 self-method
    public void selfMethod1() {
        // 处理自己的业务逻辑
    }

    // 依赖方法 dep-method
    public void depMethod1() {
        // 处理自己的业务逻辑
        // 自己不能处理的业务逻辑，委托给中介者处理
        super.mediatorCommon.doSomething1();
    }
}
