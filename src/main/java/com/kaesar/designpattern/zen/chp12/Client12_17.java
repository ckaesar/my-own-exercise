package com.kaesar.designpattern.zen.chp12;

public class Client12_17 {
    public static void main(String[] args) {
        // 定义一个游戏的角色
        IGamePlayer12_13 player = new GamePlay12_14("张三");
        // 然后再定义一个代练者
        IGamePlayer12_13 proxy = new GamePlayerProxy12_15(player);
        // 开始打游戏，记下时间戳
        System.out.println("开始时间是：2000-10-10 10：10");
        proxy.login("zhangsan", "password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间是：2000-10-10 10：11");
    }
}
