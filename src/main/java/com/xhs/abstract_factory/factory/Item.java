package com.xhs.abstract_factory.factory;

/**
 * @author haishuo.xu
 * @description 抽象零件
 * @create_at 2022/3/28 9:01
 * @since
 */
public abstract class Item {
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}
