package com.kaesar.designpattern.zen.chp32;

/**
 * 抽象压缩命令
 *
 * @Author: chengk
 * @Date: 2021/5/23 2:57 下午
 */
public abstract class AbstractCmd {
    // 对接收者的引用
    protected IReceiver zip = new ZipReceiver();
    protected IReceiver gzip = new GzipReceiver();

    // 抽象方法，命令的具体单元
    public abstract boolean execute(String source, String to);
}
