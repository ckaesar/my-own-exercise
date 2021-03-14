package com.kaesar.designpattern.zen.chp22;

public class LiuSi implements Observer {
    // 刘斯是个观察者，一旦韩非子有活动，自己也得做些事
    @Override
    public void update(String context) {
        System.out.println("刘斯：观察到韩非子活动，开始动作了...");
        this.happy(context);
        System.out.println("刘斯：乐死了...\n");
    }

    private void happy(String context) {
        System.out.println("刘斯，因为" + context + ", --所以我快乐呀！");
    }
}
