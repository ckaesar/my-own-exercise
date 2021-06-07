package com.kaesar.designpattern.zen.chp33;

/**
 * 电影明星
 *
 * @Author: chengk
 * @Date: 2021/6/6 9:59 上午
 */
public class FilmStar4 extends AbsStar {
    // 默认的电影没给你选哪个的主要工作是拍电影
    public FilmStar4() {
        super(new ActFilm());
    }

    // 也可以重新设置一个新职业
    public FilmStar4(AbsAction _action) {
        super(_action);
    }

    // 细化电影明星的职责
    @Override
    public void doJob() {
        System.out.println("\n=====影星的工作=====");
        super.doJob();
    }
}
