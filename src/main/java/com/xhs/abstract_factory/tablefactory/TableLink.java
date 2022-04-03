package com.xhs.abstract_factory.tablefactory;

import com.xhs.abstract_factory.factory.Link;

/**
 * @author haishuo.xu
 * @description 具体零件
 * @create_at 2022/3/28 9:52
 * @since
 */
public class TableLink extends Link {
    public TableLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "<td><a href=\"" + url + "\">" + caption + "</a></td>\n";
    }
}
