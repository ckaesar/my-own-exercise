package com.kaesar.jvm_zzm.chp8;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理示例
 *
 * @Author: chengk
 * @Date: 2021/5/14 1:13 下午
 */
public class DynamicProxyTest {
    interface IHello {
        void sayHello();

        void sayYes();
    }

    static class Hello implements IHello {

        @Override
        public void sayHello() {
            System.out.println("hello world.");
        }

        @Override
        public void sayYes() {
            System.out.println("say yes...");
        }
    }

    static class DynamicProxy implements InvocationHandler {

        Object originalObj;

        Object bind(Object originalObj) {
            this.originalObj = originalObj;
            // 这个方法是重点 Proxy.newProxyInstance
            return Proxy.newProxyInstance(originalObj.getClass().getClassLoader(), originalObj.getClass().getInterfaces(), this);
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("welcome");
            return method.invoke(originalObj, args);
        }
    }

    public static void main(String[] args) {
        IHello hello = (IHello) new DynamicProxy().bind(new Hello());
        hello.sayHello();
        hello.sayYes();
    }
}
