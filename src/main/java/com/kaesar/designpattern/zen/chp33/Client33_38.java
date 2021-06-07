package com.kaesar.designpattern.zen.chp33;

/**
 * @Author: chengk
 * @Date: 2021/6/6 9:43 上午
 */
public class Client33_38 {
    public static void main(String[] args) {
        // 定义所谓的明星
        IStar2 freakStar = new FreakStar();
        // 看看他是怎么粉饰自己的
        // 演前吹嘘自己无所不能
        freakStar = new HotAir(freakStar);
        // 演完后，死不承认自己演的不好
        freakStar = new Deny(freakStar);
        System.out.println("=====看看一些虚假明星的形象=====");
        freakStar.act();
    }
}
