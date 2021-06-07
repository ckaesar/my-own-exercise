package com.kaesar.designpattern.zen.chp34;

/**
 * @Author: chengk
 * @Date: 2021/6/6 12:57 下午
 */
public class DF_G extends AbstractDF {
    // 定义一下自己能处理什么参数
    @Override
    protected String getOperatorParam() {
        return AbstractDF.G_PARAM;
    }

    // 命令处理
    @Override
    protected String echo(CommandVO vo) {
        return DiskManager.df_g();
    }
}
