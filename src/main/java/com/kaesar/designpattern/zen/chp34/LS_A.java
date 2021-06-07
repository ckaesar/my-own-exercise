package com.kaesar.designpattern.zen.chp34;

/**
 * ls-a命令
 *
 * @Author: chengk
 * @Date: 2021/6/6 10:29 上午
 */
public class LS_A extends AbstractLS {

    @Override
    protected String getOperatorParam() {
        return AbstractLS.A_PARAM;
    }

    // ls -a命令
    @Override
    protected String echo(CommandVO vo) {
        return FileManager.ls_a(vo.formatData());
    }
}
