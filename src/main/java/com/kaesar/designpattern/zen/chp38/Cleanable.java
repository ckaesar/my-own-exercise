package com.kaesar.designpattern.zen.chp38;

/**
 * 三个对象的被清洁特质
 *
 * @Author: chengk
 * @Date: 2021/6/13 2:21 下午
 */
public interface Cleanable {
    // 被清洁
    public void cleaned();
}

/**
 * 花园
 */
class Garden implements Cleanable {

    @Override
    public void cleaned() {
        System.out.println("花园被清洁干净");
    }
}

/**
 * 厨房
 */
class Kitchen implements Cleanable {

    @Override
    public void cleaned() {
        System.out.println("厨房被清洁干净");
    }
}

/**
 * 衣服
 */
class Cloth implements Cleanable {

    @Override
    public void cleaned() {
        System.out.println("衣服被清洁干净");
    }
}