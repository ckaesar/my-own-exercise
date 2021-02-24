package com.kaesar.design_patterns.zen.chp16;

/**
 * 父亲
 */
public class Father implements IHandler {
    // 未出嫁的女儿来请示父亲
    @Override
    public void handleMessage(IWomen women) {
        System.out.println("女儿的请示是：" + women.getRequest());
        System.out.println("父亲的答复是：同意");
    }
}
