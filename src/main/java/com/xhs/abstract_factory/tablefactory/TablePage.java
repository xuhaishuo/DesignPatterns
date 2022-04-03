package com.xhs.abstract_factory.tablefactory;

import com.xhs.abstract_factory.factory.Item;
import com.xhs.abstract_factory.factory.Page;

import java.util.Iterator;

/**
 * @author haishuo.xu
 * @description 具体产品
 * @create_at 2022/3/28 10:04
 * @since
 */
public class TablePage extends Page {
    public TablePage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuffer sb = new StringBuffer();
        sb.append("<html><head><title>" + title + "</title></head>\n");
        sb.append("<body>\n");
        sb.append("<h1>" + title + "</h1>\n");
        sb.append("<table width=\"80%\" border=\"3\">\n");
        Iterator iterator = content.iterator();
        while (iterator.hasNext()) {
            Item item = (Item) iterator.next();
            sb.append("<tr>" + item.makeHTML() + "</tr>");
        }
        sb.append("</table>\n");
        sb.append("<hr><address>" + author + "</address>");
        sb.append("</body></html>\n");
        return sb.toString();
    }
}
