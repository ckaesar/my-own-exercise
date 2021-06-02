package com.kaesar.designpattern.zen.chp33;

/**
 * 税收接口
 *
 * @Author: chengk
 * @Date: 2021/5/29 12:55 下午
 */
public interface ITax {
    // 税收上升
    public void raise();

    // 税收下降
    public void drop();
}
