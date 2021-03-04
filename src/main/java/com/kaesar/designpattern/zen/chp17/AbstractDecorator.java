package com.kaesar.designpattern.zen.chp17;

public abstract class AbstractDecorator extends Component {
    private Component component = null;

    // 通过构造函数传递被修饰者
    public AbstractDecorator(Component _component) {
        this.component = _component;
    }

    // 委托给被修饰者执行
    @Override
    public void operate() {
        this.component.operate();
    }
}
