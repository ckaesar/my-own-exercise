package com.kaesar.designpattern.zen.chp33;

/**
 * 经纪人
 *
 * @Author: chengk
 * @Date: 2021/6/6 9:34 上午
 */
public class Agent implements IStar {
    // 定义是谁的经纪人
    private IStar star;

    // 构造函数传递明星
    public Agent(IStar star) {
        this.star = star;
    }

    // 经纪人是不会签名的，签了歌迷也不认
    @Override
    public void sign() {
        star.sign();
    }
}
