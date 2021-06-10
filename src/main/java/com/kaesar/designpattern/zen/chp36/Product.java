package com.kaesar.designpattern.zen.chp36;

import lombok.Data;

/**
 * 产品类
 *
 * @Author: chengk
 * @Date: 2021/6/10 6:31 上午
 */
@Data
public class Product implements Cloneable {
    // 产品名称
    private String name;

    // 是否可以属性变更
    private boolean canChanged = false;

    // 产生一个新的产品
    public Product(ProductManager manager, String _name) {
        // 允许建立产品
        if (manager.isCreateProduct()) {
            canChanged = true;
            this.name = _name;
        }
    }

    // 覆写clone方法
    @Override
    protected Product clone() {
        Product p = null;
        try {
            p = (Product) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
