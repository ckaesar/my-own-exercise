package com.kaesar.designpattern.zen.chp32;

/**
 * 抽象压缩算法
 *
 * @Author: chengk
 * @Date: 2021/5/23 2:43 下午
 */
public interface Algorithm {
    // 压缩算法
    public boolean compress(String source, String to);

    // 解压缩算法
    public boolean uncompress(String source, String to);
}
