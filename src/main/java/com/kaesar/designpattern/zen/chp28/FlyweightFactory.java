package com.kaesar.designpattern.zen.chp28;

import java.util.HashMap;

/**
 * 享元工厂
 *
 * @Author: chengk
 * @Date: 2021/5/18 11:42 下午
 */
public class FlyweightFactory {
    // 定义一个池容器
    private static HashMap<String, Flyweight> pool = new HashMap<>();

    // 享元工厂
    public static Flyweight getFlyWeight(String extrinsic) {
        // 需要返回的对象
        Flyweight flyweight = null;
        // 在池中没有该对象
        if (pool.containsKey(extrinsic)) {
            flyweight = pool.get(extrinsic);
        } else {
            // 根据外部状态创建享元对象
            flyweight = new ConcreteFlyweight1(extrinsic);
            // 放置到池中
            pool.put(extrinsic, flyweight);
        }
        return flyweight;
    }
}
