package com.kaesar.designpattern.zen.chp34;

/**
 * ls命令
 *
 * @Author: chengk
 * @Date: 2021/6/6 10:25 上午
 */
public class LS extends AbstractLS {
    // 参数为空
    @Override
    protected String getOperatorParam() {
        return AbstractLS.DEFAULT_PARAM;
    }

    // 最简单的ls命令
    @Override
    protected String echo(CommandVO vo) {
        return FileManager.ls(vo.formatData());
    }
}
