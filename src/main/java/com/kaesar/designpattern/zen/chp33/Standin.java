package com.kaesar.designpattern.zen.chp33;

/**
 * 替身演员
 *
 * @Author: chengk
 * @Date: 2021/6/6 9:49 上午
 */
public class Standin implements IStar3 {

    private Iactor actor;

    // 替身是谁
    public Standin(Iactor _acotr) {
        this.actor = _acotr;
    }

    @Override
    public void act(String context) {
        actor.playact(context);
    }
}
