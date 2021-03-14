package com.kaesar.designpattern.zen.chp22;

public class WangSi implements Observer {
    // 王斯是个观察者，一旦韩非子有活动
    @Override
    public void update(String context) {
        System.out.println("王斯：观察到韩非子活动，自己也开始活动了...");
        this.cry(context);
        System.out.println("王斯：哭死了...\n");
    }

    // 也看到韩非子有活动，他就痛哭
    private void cry(String context) {
        System.out.println("王斯：因为" + context + ",--所以我悲伤呀！");
    }
}
