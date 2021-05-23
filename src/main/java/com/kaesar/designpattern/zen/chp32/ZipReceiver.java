package com.kaesar.designpattern.zen.chp32;

/**
 * zip接收者
 *
 * @Author: chengk
 * @Date: 2021/5/23 3:00 下午
 */
public class ZipReceiver implements IReceiver {
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
