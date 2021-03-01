package com.kaesar.designpattern.zen.chp12;

public class Client12_3 {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三");
        System.out.println("开始时间时：2009-8-15 10：45");
        player.login("zhangsan", "password");
        player.killBoss();
        player.upgrade();
        System.out.println("结束时间时：2009-8-20 11：11");
    }
}
