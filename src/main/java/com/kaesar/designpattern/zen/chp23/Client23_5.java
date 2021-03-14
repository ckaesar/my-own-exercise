package com.kaesar.designpattern.zen.chp23;

public class Client23_5 {
    public static void main(String[] args) {
        // 现代化的邮局，有项服务，邮局名称叫 Hell Road
        ModenPostOffice hellRoadPostOffice = new ModenPostOffice();
        // 你只要把信的内容和收信人地址给他，他会帮你完成一系列的工作
        // 定义一个地址
        String address = "Happy Road No. 666, God Province, Heaven";
        // 信的内容
        String context = "Hello, It's me, do you know who I am? I'm your old lover. I'd like to...";
        // 他给你发送
        hellRoadPostOffice.sendLetter(context, address);
    }
}
