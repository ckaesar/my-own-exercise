package com.kaesar.designpattern.zen.chp34;

/**
 * ls-l命令
 *
 * @Author: chengk
 * @Date: 2021/6/6 10:28 上午
 */
public class LS_L extends AbstractLS {
    // l选项
    @Override
    protected String getOperatorParam() {
        return AbstractLS.L_PARAM;
    }

    @Override
    protected String echo(CommandVO vo) {
        return FileManager.ls_l(vo.formatData());
    }
}
