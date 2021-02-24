package com.kaesar.design_patterns.zen.chp15;

/**
 * 删除页面的命令
 */
public class DeletePageCommand extends Command {
    // 执行删除页面的命令
    @Override
    public void execute() {
        // 找到页面组
        super.pg.find();
        // 删除一个页面
        super.pg.delete();
        // 给出计划
        super.pg.plan();
    }
}
