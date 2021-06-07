package com.kaesar.designpattern.zen.chp34;

/**
 * 抽象命令名类
 *
 * @Author: chengk
 * @Date: 2021/6/6 10:18 上午
 */
public abstract class CommandName {
    private CommandName nextOperator;

    public final String handleMessage(CommandVO vo) {
        // 处理结果
        String result = "";
        // 判断是否是自己处理的参数
        if (vo.getParam().size() == 0 || vo.getParam().contains(this.getOperatorParam())) {
            result = this.echo(vo);
        } else {
            if (this.nextOperator != null) {
                result = this.nextOperator.handleMessage(vo);
            } else {
                result = "命令无法执行";
            }
        }
        return result;
    }

    // 设置剩余参数由谁来处理
    public void setNext(CommandName _operator) {
        this.nextOperator = _operator;
    }

    // 每个处理者都要处理一个后缀参数
    protected abstract String getOperatorParam();

    // 每个处理者都必须实现处理任务
    protected abstract String echo(CommandVO vo);
}
