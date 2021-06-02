package com.kaesar.designpattern.zen.chp32;

/**
 * 中国顶级DNS服务器
 *
 * @Author: chengk
 * @Date: 2021/5/29 12:00 下午
 */
public class ObserverChinaTopDnsServer extends ObserverDnsServer {
    @Override
    protected void sign(Recorder recorder) {
        recorder.setOwner("中国顶级DNS服务器");
    }

    @Override
    protected boolean isLocal(Recorder recorder) {
        return recorder.getDomain().endsWith(".cn");
    }
}
