package com.kaesar.designpattern.zen.chp32;

/**
 * @Author: chengk
 * @Date: 2021/5/23 3:09 下午
 */
public class Client32_18 {
    public static void main(String[] args) {
        // 定义一个命令，压缩一个文件
        AbstractCmd cmd = new ZipCompressCmd();
        /**
         * 换一个解压命令
         * AbstractCmd cmd = new GzipCompressCmd();
         */

    }
}
