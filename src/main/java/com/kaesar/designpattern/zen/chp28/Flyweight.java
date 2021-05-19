package com.kaesar.designpattern.zen.chp28;

/**
 * 抽象享元角色
 *
 * @Author: chengk
 * @Date: 2021/5/18 11:36 下午
 */
public abstract class Flyweight {
    // 内部状态
    private String intrinsic;

    // 外部状态
    protected final String extrinsic;

    // 要求享元角色必须接受外部状态
    public Flyweight(String extrinsic) {
        this.extrinsic = extrinsic;
    }

    // 定义业务操作
    public abstract void operate();

    public String getIntrinsic() {
        return intrinsic;
    }

    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }
}
