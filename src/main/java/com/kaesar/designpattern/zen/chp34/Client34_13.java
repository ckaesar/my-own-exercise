package com.kaesar.designpattern.zen.chp34;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: chengk
 * @Date: 2021/6/6 11:16 上午
 */
public class Client34_13 {
    public static void main(String[] args) throws IOException {
        Invoker invoker = new Invoker();
        while (true) {
            // UNIX下的默认提示符号
            System.out.println("#");
            // 捕获输出
            String input = (new BufferedReader(new InputStreamReader(System.in))).readLine();
            // 输入quit或exit则退出
            if (input.equals("quit") || input.equals("exit")) {
                return;
            }
            System.out.println(invoker.exec(input));
        }
    }
}
