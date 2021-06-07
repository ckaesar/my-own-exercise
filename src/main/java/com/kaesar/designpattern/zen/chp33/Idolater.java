package com.kaesar.designpattern.zen.chp33;

/**
 * 追星族
 *
 * @Author: chengk
 * @Date: 2021/6/6 9:36 上午
 */
public class Idolater {
    public static void main(String[] args) {
        // 崇拜的明星是谁
        IStar star = new Singer();
        // 找到明星的经纪人
        IStar agent = new Agent(star);
        System.out.println("追星族：小仙女，我是你的崇拜者，请签名！");
        // 签名
        agent.sign();
    }
}
