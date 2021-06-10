package com.kaesar.designpattern.zen.chp36;

import java.util.Observable;

/**
 * 产品事件
 *
 * @Author: chengk
 * @Date: 2021/6/10 6:44 上午
 */
public class ProductEvent extends Observable {
    // 事件起源
    private Product source;
    // 事件的类型
    private ProductEventType type;

    // 传入事件的源头，默认为新建类型
    public ProductEvent(Product p) {
        this(p, ProductEventType.NEW_PRODUCT);
    }

    // 事件源头以及事件类型
    public ProductEvent(Product p, ProductEventType _type) {
        this.source = p;
        this.type = _type;
        // 事件触发
        notifyEventDispatch();
    }

    // 获得事件的始作俑者
    public Product getSource() {
        return source;
    }

    // 获得事件的类型
    public ProductEventType getEventType() {
        return this.type;
    }

    // 通知事件处理中心
    private void notifyEventDispatch() {
        super.addObserver(EventDispatch.getEventDispatch());
        super.setChanged();
        super.notifyObservers(source);
    }
}
