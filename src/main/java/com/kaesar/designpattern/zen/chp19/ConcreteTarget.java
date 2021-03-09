package com.kaesar.designpattern.zen.chp19;

/**
 * 目标角色的实现类
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("if you need any help, please call me.");
    }
}
