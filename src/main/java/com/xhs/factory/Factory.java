package com.xhs.factory;

/**
 * @author haishuo.xu
 * @description template method + factory method
 * @create_at 2022/3/24 10:41
 * @since
 */
public abstract class Factory {

    public final Product create(String owner, Integer id) {
        Product product = createProduct(owner, id);
        registerProduct(product);
        return product;
    }

    protected abstract Product createProduct(String owner, Integer id);

    protected abstract void registerProduct(Product product);
}
