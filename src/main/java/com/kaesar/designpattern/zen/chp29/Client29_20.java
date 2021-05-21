package com.kaesar.designpattern.zen.chp29;

/**
 * @Author: chengk
 * @Date: 2021/5/20 11:39 下午
 */
public class Client29_20 {
    public static void main(String[] args) {
        // 定义一个实现化角色
        Implementor imp = new ConcreteImplementor1();
        // 定义一个抽象化角色
        Abstraction abs = new RefinedAbstraction(imp);
        // 执行行文
        abs.request();
    }
}
