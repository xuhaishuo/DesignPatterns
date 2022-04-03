package com.xhs.abstract_factory.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author haishuo.xu
 * @description 抽象产品
 * @create_at 2022/3/28 9:05
 * @since
 */
public abstract class Page {
    protected String title;
    protected String author;
    protected ArrayList content = new ArrayList();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item) {
        content.add(item);
    }

    public void output() {
        try {
            String filename = title + ".html";
            FileWriter writer = new FileWriter(filename);
            writer.write(this.makeHTML());
            writer.close();
            System.out.println(filename + " 编写完成");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String makeHTML();
}
