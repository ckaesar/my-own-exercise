package com.kaesar.design_patterns.zen;

import java.util.HashMap;
import java.util.Map;

/**
 * 延迟加载的工厂类
 */
public class ProductFactory8_22 {
    private static final Map<String, Product> prMap = new HashMap<>();

    public static synchronized Product createProduct(String type) throws Exception {
        Product product = null;
        // 如果Map中已经有这个对象
        if (prMap.containsKey(type)) {
            product = prMap.get(type);
        } else {
            if (type.equals("Product1")) {
                product = new ConcreteProduct1();
            } else {
                product = new ConcreteProduct2();
            }
            prMap.put(type, product);
        }
        return product;
    }
}
