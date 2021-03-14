package com.kaesar.designpattern.zen.chp22;

public class Client22_6 {
    public static void main(String[] args) throws InterruptedException {
        // 定义出韩非子和李斯来
        LiSi lisi = new LiSi();
        HanFeiZi hanFeiZi = new HanFeiZi();
        // 观察早餐
        Spy watchBreakfast = new Spy(hanFeiZi, lisi, "breakfast");
        // 开始启动线程，监控
        watchBreakfast.start();
        // 观察娱乐情况
        Spy watchFun = new Spy(hanFeiZi, lisi, "fun");
        watchFun.start();
        // 然后我们看看韩非子在干什么
        Thread.sleep(1000); // 主线程等待1秒后再继续往下执行
        hanFeiZi.haveBreakfast();
        // 韩非子娱乐了
        Thread.sleep(1000);
        hanFeiZi.haveFun();
    }
}
