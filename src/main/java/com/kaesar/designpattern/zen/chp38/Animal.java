package com.kaesar.designpattern.zen.chp38;

/**
 * 动物叫声接口
 *
 * @Author: chengk
 * @Date: 2021/6/13 2:31 下午
 */
public interface Animal {
    public void makeSound();
}

/**
 * 定义一个小狗
 */
class Dog implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Wang Wang Wang.");
    }
}
