package com.xhs.abstract_factory;


import com.xhs.abstract_factory.factory.Factory;
import com.xhs.abstract_factory.factory.Link;
import com.xhs.abstract_factory.factory.Page;
import com.xhs.abstract_factory.factory.Tray;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/3/28 9:17
 * @since
 */
public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main class.name.of ConcreteFactory");
            System.out.println("Example 1: java Main com.xhs.abstract_factory.listfactory.ListFactory");
            System.out.println("Example 2: java Main com.xhs.abstract_factory.tablefactory.TableFactory");
            System.exit(0);
        }
        Factory factory = Factory.getFactory(args[0]);

        Link people = factory.createLink("人民日报", "https://www.people.com.cn/");
        Link gmw = factory.createLink("光明日报", "https://www.gmw.cn");

        Link us_yahoo= factory.createLink("Yahoo!", "https://www.yahoo.com/");
        Link jp_yahoo = factory.createLink("Yahoo!Japan", "https://www.yahoo.cp.jp/");
        Link excite = factory.createLink("Excite", "https://www.excite.com/");
        Link google = factory.createLink("Google", "https://www.google.com/");

        Tray trayNews = factory.createTray("日报");
        trayNews.add(people);
        trayNews.add(gmw);

        Tray trayYahoo = factory.createTray("Yahoo!");
        trayYahoo.add(us_yahoo);
        trayYahoo.add(jp_yahoo);

        Tray traySearch = factory.createTray("检索引擎");
        traySearch.add(trayYahoo);
        traySearch.add(excite);
        trayNews.add(google);

        Page page = factory.createPage("LinkPage", "徐海硕");
        page.add(trayNews);
        page.add(traySearch);
        page.output();
    }
}
