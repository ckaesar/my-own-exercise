package com.kaesar.designpattern.zen.chp33;

/**
 * 电影明星
 *
 * @Author: chengk
 * @Date: 2021/6/6 9:48 上午
 */
public class FilmStar implements IStar3 {
    @Override
    public void act(String context) {
        System.out.println("明星演戏：" + context);
    }
}
