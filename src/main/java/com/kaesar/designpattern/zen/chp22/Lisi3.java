package com.kaesar.designpattern.zen.chp22;

public class Lisi3 implements Observer {
    // 首先李斯是个观察者，一旦韩非子有活动，他就知道，他就要向老板汇报
    @Override
    public void update(String context) {
        System.out.println("李斯：观察到韩非子活动，开始向老板汇报...");
        this.reportToQinShiHuang(context);
        System.out.println("李斯：汇报完毕...\n");
    }

    private void reportToQinShiHuang(String reprotContext) {
        System.out.println("李斯：报告，秦老板！韩非子有活动了--->" + reprotContext);
    }
}
