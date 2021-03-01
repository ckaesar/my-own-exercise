package com.kaesar.designpattern.zen.chp12;

public class Client12_5 {
    public static void main(String[] args) {
        // 定义一个痴迷的玩家
        IGamePlayer player = new GamePlayer("张三");
        // 然后再定义一个代练者
        IGamePlayer proxy = new GamePlayProxy(player);
        // 开始打游戏，记下时间戳
        System.out.println("开始时间是 2010-10-10 10：10");
        proxy.login("张三", "password");
        // 开始杀怪
        proxy.killBoss();
        // 升级
        proxy.upgrade();
        // 记录游戏结束时间
        System.out.println("结束时间是：2010-11-11 11：11");
    }
}
