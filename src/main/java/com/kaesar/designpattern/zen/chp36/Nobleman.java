package com.kaesar.designpattern.zen.chp36;

/**
 * 贵族
 *
 * @Author: chengk
 * @Date: 2021/6/10 7:13 上午
 */
public class Nobleman extends EventCustomer {
    // 定义贵族能够处理的事件级别
    public Nobleman() {
        super(EventCustomType.EDIT);
        super.addCustomType(EventCustomType.CLONE);
    }

    @Override
    public void exec(ProductEvent event) {
        // 事件的源头
        Product p = event.getSource();
        // 事件类型
        ProductEventType type = event.getEventType();
        if (type.getValue() == EventCustomType.CLONE.getValue()) {
            System.out.println("贵族处理事件：" + p.getName() + "克隆，事件类型=" + type);
        } else {
            System.out.println("贵族处理事件：" + p.getName() + "修改，事件类型=" + type);
        }
    }
}
