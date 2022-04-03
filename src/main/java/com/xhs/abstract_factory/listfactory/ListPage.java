package com.xhs.abstract_factory.listfactory;

import com.xhs.abstract_factory.factory.Item;
import com.xhs.abstract_factory.factory.Page;

import java.util.Iterator;

/**
 * @author haishuo.xu
 * @description 具体产品
 * @create_at 2022/3/28 9:38
 * @since
 */
public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuffer sb = new StringBuffer();
        sb.append("<html><head><title>" + title + "</title></head>\n");
        sb.append("<body>\n");
        sb.append("<h1>" + title + "</h1>\n");
        sb.append("<ul>\n");
        Iterator iterator = content.iterator();
        while (iterator.hasNext()) {
            Item item = (Item) iterator.next();
            sb.append(item.makeHTML());
        }
        sb.append("</ul>\n");
        sb.append("<hr><address>" + author + "</address>");
        sb.append("</body></html>\n");
        return sb.toString();
    }
}
