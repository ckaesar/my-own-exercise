package com.kaesar.designpattern.zen.chp32;

/**
 * gzip解压缩命令
 *
 * @Author: chengk
 * @Date: 2021/5/23 3:06 下午
 */
public class GzipUncompressCmd extends AbstractCmd {
    @Override
    public boolean execute(String source, String to) {
        return super.gzip.uncompress(source, to);
    }
}
