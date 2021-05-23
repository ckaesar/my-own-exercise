package com.kaesar.designpattern.zen.chp32;

/**
 * zip压缩算法
 *
 * @Author: chengk
 * @Date: 2021/5/23 2:45 下午
 */
public class Zip implements Algorithm {
    // zip格式的压缩算法
    @Override
    public boolean compress(String source, String to) {
        System.out.println(source + " --> " + to + " ZIP压缩成功！");
        return true;
    }

    // zip格式的解压缩算法
    @Override
    public boolean uncompress(String source, String to) {
        System.out.println(source + " --> " + to + " ZIP解压缩成功！");
        return true;
    }
}
