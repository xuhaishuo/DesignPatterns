package com.xhs.prototype;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/3/26 11:43
 * @since
 */
public interface Product extends Cloneable {

    void use(String s);

    Product createClone();
}
