package com.xhs.abstract_factory.tablefactory;

import com.xhs.abstract_factory.factory.Factory;
import com.xhs.abstract_factory.factory.Link;
import com.xhs.abstract_factory.factory.Page;
import com.xhs.abstract_factory.factory.Tray;

/**
 * @author haishuo.xu
 * @description 具体工厂
 * @create_at 2022/3/28 9:52
 * @since
 */
public class TableFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
