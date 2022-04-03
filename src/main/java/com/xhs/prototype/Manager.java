package com.xhs.prototype;

import java.util.HashMap;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/3/26 11:44
 * @since
 */
public class Manager {
    private HashMap showcase = new HashMap();

    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    public Product create(String protoname) {
        Product product = (Product) showcase.get(protoname);
        return product;
    }
}
