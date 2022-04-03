package com.xhs.abstract_factory.tablefactory;

import com.xhs.abstract_factory.factory.Item;
import com.xhs.abstract_factory.factory.Tray;

import java.util.Iterator;

/**
 * @author haishuo.xu
 * @description 具体零件
 * @create_at 2022/3/28 9:53
 * @since
 */
public class TableTray extends Tray {
    public TableTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer sb = new StringBuffer();
        sb.append("<td>");
        sb.append("<table width=\"100%\" border=\"1\"><tr>");
        sb.append("<td bgcolor=\"#cccccc\" aligin=\"center\" colspan=\"" + tray.size() + "\"><b>" + caption + "</b></td>");
        sb.append("</tr>\n");
        sb.append("<tr>\n");
        Iterator iterator = tray.iterator();
        while (iterator.hasNext()) {
            Item item = (Item) iterator.next();
            sb.append(item.makeHTML());
        }
        sb.append("</tr></table>");
        sb.append("</td>");
        return sb.toString();
    }
}
