package com.xhs.abstract_factory.listfactory;

import com.xhs.abstract_factory.factory.Item;
import com.xhs.abstract_factory.factory.Tray;

import java.util.Iterator;

/**
 * @author haishuo.xu
 * @description 具体零件
 * @create_at 2022/3/28 9:32
 * @since
 */
public class ListTray extends Tray  {

    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<li>\n");
        sb.append(caption + "\n");
        sb.append("<ul>\n");
        Iterator iterator = tray.iterator();
        while (iterator.hasNext()) {
            Item item = (Item) iterator.next();
            sb.append(item.makeHTML());
        }
        sb.append("</ul>\n");
        sb.append("</li>\n");
        return sb.toString();
    }
}
