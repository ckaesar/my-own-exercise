package com.kaesar.designpattern.zen.chp18;

public class ZhaoYun {
    // 赵云出场了，他根据诸葛亮给他的交代，一次拆开妙计
    public static void main(String[] args) {
        Context context;
        // 刚刚到吴国时拆第一个
        System.out.println("---刚刚到吴国时拆第一个---");
        context = new Context(new BackDoor()); // 拿到妙计
        context.operate(); // 执行拆开
        System.out.println("\n\n\n");
        // 刘备乐不思蜀了，拆第二个了
        System.out.println("---刘备乐不思蜀了，拆第二个了---");
        context = new Context(new GivenGreenLight());
        context.operate(); // 执行第二个
        System.out.println("\n\n\n");
        // 孙权的小兵追来了，咋办？拆第三个
        System.out.println("---孙权的小兵追来了，咋办？拆第三个---");
        context = new Context(new BlockEnemy());
        context.operate(); // 孙夫人退兵
        System.out.println("\n\n\n");
    }
}
