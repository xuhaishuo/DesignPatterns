package com.xhs.abstract_factory.listfactory;

import com.xhs.abstract_factory.factory.Link;

/**
 * @author haishuo.xu
 * @description 具体零件
 * @create_at 2022/3/28 9:30
 * @since
 */
public class ListLink extends Link  {

    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "    <li><a href=\"" + url +"\">" + caption + "</a></li>\n";
    }
}
