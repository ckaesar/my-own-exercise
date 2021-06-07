package com.kaesar.designpattern.zen.chp34;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令配置对象
 *
 * @Author: chengk
 * @Date: 2021/6/6 11:13 上午
 */
public enum CommandEnum {
    ls("com.kaesar.designpattern.zen.chp34.LSCommand"),
    df("com.kaesar.designpattern.zen.chp34.DFCommand");

    private String value = "";

    // 定义构造函数，目的是Data(value)类型的相匹配
    private CommandEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public static List<String> getNames() {
        CommandEnum[] commandEnums = CommandEnum.values();
        List<String> names = new ArrayList<>();
        for (CommandEnum c : commandEnums) {
            names.add(c.name());
        }
        return names;
    }
}
