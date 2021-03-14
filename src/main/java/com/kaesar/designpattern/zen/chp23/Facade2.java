package com.kaesar.designpattern.zen.chp23;

/**
 * 新增门面对象
 */
public class Facade2 {
    // 引用原有的门面
    private Facade facade = new Facade();

    // 对外提供唯一的访问子系统的方法
    public void methodB() {
        this.facade.methodB();
    }
}
