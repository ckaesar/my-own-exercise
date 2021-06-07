package com.kaesar.designpattern.zen.chp34;

/**
 * 具体的ls命令
 *
 * @Author: chengk
 * @Date: 2021/6/6 11:05 上午
 */
public class LSCommand extends Command {
    @Override
    public String execute(CommandVO vo) {
        // 返回链表的首节点
        CommandName firstNode = super.buildChain(AbstractLS.class).get(0);
        return firstNode.handleMessage(vo);
    }
}
