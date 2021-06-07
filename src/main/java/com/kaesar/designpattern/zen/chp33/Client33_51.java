package com.kaesar.designpattern.zen.chp33;

/**
 * @Author: chengk
 * @Date: 2021/6/6 10:03 上午
 */
public class Client33_51 {
    public static void main(String[] args) {
        // 声明一个电影明星
        AbsStar zhangSan = new FilmStar4();
        // 声明一个歌星
        AbsStar liSi = new Singer4();
        // 展示一下各个没给你选哪个的主要工作
        zhangSan.doJob();
        liSi.doJob();
        // 当然，也有部分明星不务正业，比如歌星演戏
        liSi = new Singer4(new ActFilm());
        liSi.doJob();
    }
}
