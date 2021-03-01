package com.kaesar.designpattern.zen.chp12;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client12_22 {
    public static void main(String[] args) throws Throwable {
        // 定义一个痴迷的玩家
        IGamePlayer player = new GamePlayer("张三");
        // 定义一个handler
        InvocationHandler handler = new GamePlayIH(player);
        // 开始打游戏，记下时间戳
        System.out.println("开始时间时： 2010-10-10 10：10");
        // 获得类的class loader
        ClassLoader cl = player.getClass().getClassLoader();
        // 动态代理产生一个代理者
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, new Class[]{IGamePlayer.class}, handler);
        // 登录
        proxy.login("zhangsan", "password");
        // 杀怪
        proxy.killBoss();
        // 升级
        proxy.upgrade();
        System.out.println("游戏结束时间是：2010-10-10 10：11");
    }
}
