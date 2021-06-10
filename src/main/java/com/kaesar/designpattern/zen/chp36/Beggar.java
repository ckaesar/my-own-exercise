package com.kaesar.designpattern.zen.chp36;

/**
 * 乞丐
 *
 * @Author: chengk
 * @Date: 2021/6/10 7:08 上午
 */
public class Beggar extends EventCustomer {
    // 只能处理被人遗弃的东西
    public Beggar() {
        super(EventCustomType.DEL);
    }

    @Override
    public void exec(ProductEvent event) {
        // 事件的源头
        Product p = event.getSource();
        // 事件类型
        ProductEventType type = event.getEventType();
        System.out.println("乞丐处理事件：" + p.getName() + "销毁，事件类型=" + type);
    }
}
