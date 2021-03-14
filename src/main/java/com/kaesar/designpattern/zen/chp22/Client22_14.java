package com.kaesar.designpattern.zen.chp22;

public class Client22_14 {
    public static void main(String[] args) {
        // 三个观察者产生出来
        Observer lisi = new Lisi3();
        Observer wangsi = new WangSi();
        Observer liusi = new LiuSi();
        // 定义出韩非子
        HanFeiZi3 hanFeiZi3 = new HanFeiZi3();
        // 描述场景，有三个人在观察韩非子
        hanFeiZi3.addObserver(lisi);
        hanFeiZi3.addObserver(wangsi);
        hanFeiZi3.addObserver(liusi);
        // 这里看到韩非子在做什么
        hanFeiZi3.haveBreakfast();
    }
}
