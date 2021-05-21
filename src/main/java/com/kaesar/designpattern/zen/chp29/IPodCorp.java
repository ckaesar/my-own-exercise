package com.kaesar.designpattern.zen.chp29;

/**
 * @Author: chengk
 * @Date: 2021/5/20 11:11 下午
 */
public class IPodCorp extends Corp {
    // 我开始生产iPod了
    @Override
    protected void produce() {
        System.out.println("我生产iPod了...");
    }

    // 山寨的iPod很畅销，便宜嘛
    @Override
    protected void sell() {
        System.out.println("iPod畅销...");
    }

    // 狂赚钱
    public void makeMoney() {
        super.makeMoney();
        System.out.println("我赚钱呀...");
    }
}
