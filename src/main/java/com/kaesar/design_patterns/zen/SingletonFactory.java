package com.kaesar.design_patterns.zen;

import java.lang.reflect.Constructor;

public class SingletonFactory {
    private static Singleton8_20 singleton;

    static {
        try {
            Class c1 = Class.forName(Singleton8_20.class.getName());
            // 获得无参构造
            Constructor constructor = c1.getDeclaredConstructor();
            // 设置无参构造是可访问的
            constructor.setAccessible(true);
            // 产生一个实例对象
            singleton = (Singleton8_20) constructor.newInstance();
        } catch (Exception e) {
            // 异常处理
        }
    }

    public static Singleton8_20 getSingleton() {
        return singleton;
    }
}
