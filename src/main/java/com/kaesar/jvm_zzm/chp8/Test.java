package com.kaesar.jvm_zzm.chp8;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Field;

/**
 * 使用MethodHandle来解决问题
 */
public class Test {
    class GrandFather {
        void thinking() {
            System.out.println("i am grandfather");
        }
    }

    class Father extends com.kaesar.jvm_zzm.chp8.GrandFather {

        @Override
        void thinking() {
            System.out.println("i am father");
        }
    }

    class Son extends com.kaesar.jvm_zzm.chp8.Father {
        @Override
        void thinking() {
            // 怎么实现调用祖父类的thinking()方法，打印"i am grandfather" ???   下面的方法并没有打印
            try {
                MethodType mt = MethodType.methodType(void.class);
                Field lookupImpl = MethodHandles.Lookup.class.getDeclaredField("IMPL_LOOKUP");
                lookupImpl.setAccessible(true);
                MethodHandle mh = ((MethodHandles.Lookup) lookupImpl.get(null)).findSpecial(GrandFather.class, "thinking", mt, getClass());
                mh.invoke(this);
            } catch (Throwable e) {

            }
        }
    }

    public static void main(String[] args) {
        (new Test().new Son()).thinking();
    }
}
