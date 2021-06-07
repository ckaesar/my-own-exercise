package com.kaesar.designpattern.zen.chp34;

/**
 * 可执行的df命令
 *
 * @Author: chengk
 * @Date: 2021/6/6 12:58 下午
 */
public class DFCommand extends Command {
    @Override
    public String execute(CommandVO vo) {
        return super.buildChain(AbstractDF.class).get(0).handleMessage(vo);
    }
}
