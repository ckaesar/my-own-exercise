package com.kaesar.design_patterns.zen.chp13;

public class PrototypeClass implements Cloneable {
    // 覆写父类Object方法
    public PrototypeClass clone() {
        PrototypeClass prototypeClass = null;
        try {
            prototypeClass = (PrototypeClass) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototypeClass;
    }
}
