package com.kaesar.designpattern.zen.chp29;

/**
 * @Author: chengk
 * @Date: 2021/5/20 11:08 下午
 */
public class Client29_6 {
    public static void main(String[] args) {
        System.out.println("-----房地产公司是这样运行的-----");
        // 先找到我的公司
        HouseCorp houseCorp = new HouseCorp();
        // 看我怎么挣钱
        houseCorp.makeMoney();
        System.out.println("\n");
        System.out.println("-----山寨公司是这样运行的-----");
        IPodCorp iPodCorp = new IPodCorp();
        iPodCorp.makeMoney();
    }
}
