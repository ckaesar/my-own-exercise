package com.kaesar.designpattern.zen.chp32;

/**
 * 抽象接收者
 *
 * @Author: chengk
 * @Date: 2021/5/23 2:58 下午
 */
public interface IReceiver {
    // 压缩
    public boolean compress(String source, String to);

    // 解压缩
    public boolean uncompress(String source, String to);
}
