package com.kaesar.designpattern.zen.chp32;

/**
 * zip解压缩命令
 *
 * @Author: chengk
 * @Date: 2021/5/23 3:05 下午
 */
public class ZipUncompressCmd extends AbstractCmd {
    @Override
    public boolean execute(String source, String to) {
        return super.zip.uncompress(source, to);
    }
}
