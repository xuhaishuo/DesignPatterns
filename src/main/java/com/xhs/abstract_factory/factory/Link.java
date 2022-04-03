package com.xhs.abstract_factory.factory;

/**
 * @author haishuo.xu
 * @description 抽象零件
 * @create_at 2022/3/28 9:02
 * @since
 */
public abstract class Link extends Item {
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
