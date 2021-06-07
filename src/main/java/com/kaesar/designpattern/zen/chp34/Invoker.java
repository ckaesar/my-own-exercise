package com.kaesar.designpattern.zen.chp34;

/**
 * 命令分发
 *
 * @Author: chengk
 * @Date: 2021/6/6 11:09 上午
 */
public class Invoker {
    // 执行命令
    public String exec(String _commandStr) {
        // 定义返回值
        String result = "";
        // 首先解析命令
        CommandVO vo = new CommandVO(_commandStr);
        // 检查是否支持该命令
        if (CommandEnum.getNames().contains(vo.getCommandName())) {
            // 产生命令对象
            String className = CommandEnum.valueOf(vo.getCommandName()).getValue();
            Command command;
            try {
                command = (Command) Class.forName(className).newInstance();
                result = command.execute(vo);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            result = "无法执行命令，请检查命令格式";
        }
        return result;
    }
}
