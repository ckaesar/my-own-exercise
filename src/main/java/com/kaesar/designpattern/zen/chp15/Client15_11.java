package com.kaesar.designpattern.zen.chp15;

/**
 * 增加一项需求
 */
public class Client15_11 {
    public static void main(String[] args) {
        // 定义一个接头人
        Invoker xiaoSan = new Invoker();
        // 客户要求新增一项需求
        System.out.println("-----客户要求新增一项需求-----");
        // 客户下命令
        Command command = new AddRequirementCommand();
        // 接头人接收到命令
        xiaoSan.setCommand(command);
        // 接头人执行命令
        xiaoSan.action();

        System.out.println();
        System.out.println("-----客户要求删除一个页面-----");
        // 客户又要下命令
        Command command1 = new DeletePageCommand();
        // 接头人接到第二个命令
        xiaoSan.setCommand(command1);
        // 接头人执行第二个命令
        xiaoSan.action();
    }
}
