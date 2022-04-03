package com.xhs.builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/3/27 9:17
 * @since
 */
public class HTMLBuilder extends Builder {
    private String filename;
    private PrintWriter writer;

    @Override
    protected void buildTitle(String title) {
        filename = title + ".html";
        try {
            writer = new PrintWriter(new FileWriter(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head><title>" + title + "</title></head><body>");
        writer.println("<h1>" + title + "</h1>");
    }

    @Override
    protected void buildString(String str) {
        writer.println("<p>" + str + "</p>");
    }

    @Override
    protected void buildItems(String[] items) {
        writer.println("<ul>");
        for (int i=0;i<items.length;i++) {
            writer.println("<li>" + items[i] + "</li>");
        }
        writer.println("</ul>");
    }

    @Override
    protected void buildClose() {
        writer.println("</body><html>");
        writer.close();
    }

    public String getResult() {
        return filename;
    }
}
