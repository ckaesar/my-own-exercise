package com.kaesar.designpattern.zen.chp34;

/**
 * 模拟的文件管理类
 *
 * @Author: chengk
 * @Date: 2021/6/6 10:31 上午
 */
public class FileManager {
    // ls命令
    public static String ls(String path) {
        return "fiel1\nfile2\nfile3\nfile4";
    }

    // ls -l命令
    public static String ls_l(String path) {
        String str = "drw-rw-rw root system 1024 2021-01-01 00:00 file1\n";
        str += "drw-rw-rw root system 1024 2021-01-01 00:00 file2\n";
        str += "drw-rw-rw root system 1024 2021-01-01 00:00 file3\n";
        return str;
    }

    // ls -a命令
    public static String ls_a(String path) {
        String str = ".\n..\nfile1\nfile2\nfile3";
        return str;
    }
}
