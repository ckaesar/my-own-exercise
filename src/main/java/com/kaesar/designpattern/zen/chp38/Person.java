package com.kaesar.designpattern.zen.chp38;

/**
 * 听动物叫声的人
 *
 * @Author: chengk
 * @Date: 2021/6/13 2:32 下午
 */
public class Person {
    public void hear(Animal animal) {
        if (animal != null) {
            animal.makeSound();
        }
    }
}
