package com.kaesar.designpattern.zen.chp32;

import lombok.Data;

/**
 * 解析记录
 *
 * @Author: chengk
 * @Date: 2021/5/29 11:27 上午
 */
@Data
public class Recorder {
    // 域名
    private String domain;

    // IP地址
    private String ip;

    // 属主
    private String owner;

    // 输出记录信息
    @Override
    public String toString() {
        String str = "域名：" + this.domain + "\n IP地址：" + this.ip +
                "\n解析者：" + this.owner;
        return str;
    }

}
