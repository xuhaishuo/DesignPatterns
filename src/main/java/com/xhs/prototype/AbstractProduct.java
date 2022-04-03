package com.xhs.prototype;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/3/26 12:25
 * @since
 */
public abstract class AbstractProduct implements Product{
    @Override
    public abstract void use(String s);

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
