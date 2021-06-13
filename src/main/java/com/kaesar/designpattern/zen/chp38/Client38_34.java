package com.kaesar.designpattern.zen.chp38;

/**
 * @Author: chengk
 * @Date: 2021/6/13 2:24 下午
 */
public class Client38_34 {
    public static void main(String[] args) {
        // 厨师清洁厨房
        Cleaner cookie = new Cleaner();
        cookie.clean(new Kitchen());
        // 园丁清洁花园
        Cleaner gardener = new Cleaner();
        gardener.clean(new Garden());
        // 裁缝清洁衣服
        Cleaner tailer = new Cleaner();
        tailer.clean(new Cloth());
    }
}
