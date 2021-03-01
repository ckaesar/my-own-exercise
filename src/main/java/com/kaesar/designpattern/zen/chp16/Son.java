package com.kaesar.designpattern.zen.chp16;

/**
 * 儿子类
 */
public class Son implements IHandler {
    // 母亲向儿子请示
    @Override
    public void handleMessage(IWomen women) {
        System.out.println("母亲的请示是：" + women.getRequest());
        System.out.println("儿子的答复是：同意");
    }
}
