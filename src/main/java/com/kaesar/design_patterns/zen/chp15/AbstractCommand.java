package com.kaesar.design_patterns.zen.chp15;

/**
 * 抽象的Command类
 */
public abstract class AbstractCommand {
    // 每个命令类都必须有一个执行命令的方法
    public abstract void execute();
}
