package com.kaesar.designpattern.zen.chp28;

/**
 * 具体享元角色
 *
 * @Author: chengk
 * @Date: 2021/5/18 11:40 下午
 */
public class ConcreteFlyweight2 extends Flyweight {
    // 接受外部状态
    public ConcreteFlyweight2(String extrinsic) {
        super(extrinsic);
    }

    // 根据外部状态进行逻辑处理
    @Override
    public void operate() {
        // 业务逻辑
    }
}
