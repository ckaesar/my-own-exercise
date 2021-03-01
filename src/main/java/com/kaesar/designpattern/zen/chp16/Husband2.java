package com.kaesar.designpattern.zen.chp16;

/**
 * 丈夫类
 */
public class Husband2 extends Handler {
    // 丈夫只处理妻子的请求
    public Husband2() {
        super(Handler.HUSBAND_LEVEL_REQUEST);
    }

    // 丈夫请示的答复
    @Override
    protected void response(IWomen women) {
        System.out.println("-----妻子向丈夫请示-----");
        System.out.println(women.getRequest());
        System.out.println("丈夫的答复是：同意\n");
    }
}
