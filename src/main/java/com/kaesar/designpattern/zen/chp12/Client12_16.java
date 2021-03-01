package com.kaesar.designpattern.zen.chp12;

public class Client12_16 {
    public static void main(String[] args) {
        // 定义一个游戏的角色
        IGamePlayer12_13 player = new GamePlay12_14("张三");
        // 开始打游戏，记下时间戳
        System.out.println("开始时间是：2000-10-10 10：10");
        player.login("zhangsan", "password");
        player.killBoss();
        player.upgrade();
        System.out.println("结束时间是：2000-10-10 10：11");
    }
}
