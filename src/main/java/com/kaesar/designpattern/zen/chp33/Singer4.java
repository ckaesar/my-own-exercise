package com.kaesar.designpattern.zen.chp33;

/**
 * 歌星
 *
 * @Author: chengk
 * @Date: 2021/6/6 10:01 上午
 */
public class Singer4 extends AbsStar {
    // 歌星的默认活动是唱歌
    public Singer4() {
        super(new Sing());
    }

    // 也可以重新设置一个新职业
    public Singer4(AbsAction _action) {
        super(_action);
    }

    // 细化歌星的职责
    @Override
    public void doJob() {
        System.out.println("\n=====歌星的工作=====");
        super.doJob();
    }
}
