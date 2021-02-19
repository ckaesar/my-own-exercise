package com.kaesar.design_patterns.zen.chp12;

public class Client12_18 {
    public static void main(String[] args) {
        // 定义一个游戏的角色
        IGamePlayer12_13 player = new GamePlay12_14("张三");
        // 获得指定的代理
        IGamePlayer12_13 proxy = player.getProxy();
        // 开始打游戏，记下时间戳
        System.out.println("开始时间是：2000-10-10 10：10");
        proxy.login("zhangsan", "password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间是：2000-10-10 10：11");
    }
}
