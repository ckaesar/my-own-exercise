package com.kaesar.designpattern.zen.chp32;


/**
 * zip压缩命令
 *
 * @Author: chengk
 * @Date: 2021/5/23 3:04 下午
 */
public class ZipCompressCmd extends AbstractCmd {

    @Override
    public boolean execute(String source, String to) {
        return super.zip.compress(source, to);
    }
}
