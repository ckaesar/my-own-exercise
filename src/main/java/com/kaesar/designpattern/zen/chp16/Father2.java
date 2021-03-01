package com.kaesar.designpattern.zen.chp16;

/**
 * 父亲类
 */
public class Father2 extends Handler {
    // 父亲只处理女儿的请求
    public Father2() {
        super(Handler.FATHER_LEVEL_REQUEST);
    }

    // 父亲的答复
    @Override
    protected void response(IWomen women) {
        System.out.println("-----女儿向父亲请示-----");
        System.out.println(women.getRequest());
        System.out.println("父亲的答复是：同意\n");
    }
}
