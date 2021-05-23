package com.kaesar.designpattern.zen.chp31;

/**
 * 白天鹅
 *
 * @Author: chengk
 * @Date: 2021/5/23 2:27 下午
 */
public class WhiteSwan implements Swan {
    @Override
    public void cry() {
        System.out.println("叫声是克鲁-克鲁-克鲁");
    }

    @Override
    public void fly() {
        System.out.println("能够飞行");
    }

    @Override
    public void desApperance() {
        System.out.println("外形是纯白色，惹人喜爱");
    }
}
