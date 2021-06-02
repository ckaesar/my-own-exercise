package com.kaesar.designpattern.zen.chp32;

/**
 * 上海DNS服务器
 *
 * @Author: chengk
 * @Date: 2021/5/29 11:59 上午
 */
public class ObserverSHDnsServer extends ObserverDnsServer {
    @Override
    protected void sign(Recorder recorder) {
        recorder.setOwner("上海DNS服务器");
    }

    @Override
    protected boolean isLocal(Recorder recorder) {
        return recorder.getDomain().endsWith(".sh.cn");
    }
}
