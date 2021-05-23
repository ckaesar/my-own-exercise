package com.kaesar.designpattern.zen.chp30;

/**
 * 宝马车建造车间
 *
 * @Author: chengk
 * @Date: 2021/5/23 11:47 上午
 */
public class BMWBuilder extends CarBuilder {

    @Override
    protected String buildWheel() {
        return super.getBluePrint().getWheel();
    }

    @Override
    protected String buidEngine() {
        return super.getBluePrint().getEngine();
    }
}
