package com.kaesar.jvm_zzm.chp8;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Field;

/**
 * 方法调用问题
 */
public class GrandFather {
    void thinking() {
        System.out.println("i am grandfather");
    }
}

class Father extends GrandFather {

    @Override
    void thinking() {
        System.out.println("i am father");
    }
}

class Son extends Father {
    @Override
    void thinking() {
        System.out.println("i am son");
        // 怎么实现调用祖父类的thinking()方法，打印"i am grandfather" ???

        try {
            MethodType mt = MethodType.methodType(void.class);
            Field lookupImpl = MethodHandles.Lookup.class.getDeclaredField("IMPL_LOOKUP");
            MethodHandle mh = ((MethodHandles.Lookup) lookupImpl.get(null)).findSpecial(GrandFather.class, "thinking", mt, getClass());
            mh.invoke(this);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Son().thinking();
    }
}