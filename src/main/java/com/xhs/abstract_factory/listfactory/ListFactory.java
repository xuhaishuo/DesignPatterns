package com.xhs.abstract_factory.listfactory;

import com.xhs.abstract_factory.factory.Factory;
import com.xhs.abstract_factory.factory.Link;
import com.xhs.abstract_factory.factory.Page;
import com.xhs.abstract_factory.factory.Tray;

/**
 * @author haishuo.xu
 * @description 具体工厂
 * @create_at 2022/3/28 9:28
 * @since
 */
public class ListFactory extends Factory {

    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
