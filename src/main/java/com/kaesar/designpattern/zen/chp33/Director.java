package com.kaesar.designpattern.zen.chp33;

/**
 * 导演类
 *
 * @Author: chengk
 * @Date: 2021/6/6 9:51 上午
 */
public class Director {
    public static void main(String[] args) {
        System.out.println("=====演戏过程模拟=====");
        // 定义一个大明星
        IStar3 star = new FilmStar();
        star.act("前十五分钟，明星本人演戏");
        // 导演把一个普通演员当做明星演员来用
        Iactor actor = new UnknownActor();
        IStar3 standin = new Standin(actor);
        standin.act("中间五分钟，替身在演戏");
        star.act("后十五分钟，明星本人演戏");
    }
}
