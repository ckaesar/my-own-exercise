package com.kaesar.designpattern.zen.chp33;

/**
 * 普通演员
 *
 * @Author: chengk
 * @Date: 2021/6/6 9:49 上午
 */
public class UnknownActor implements Iactor {
    @Override
    public void playact(String context) {
        System.out.println("普通演员：" + context);
    }
}
