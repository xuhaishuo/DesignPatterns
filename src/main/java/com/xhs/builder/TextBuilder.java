package com.xhs.builder;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/3/27 9:12
 * @since
 */
public class TextBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();

    @Override
    protected void buildTitle(String title) {
        buffer.append("=================================\n");
        buffer.append("[" + title + "]\n");
        buffer.append("\n");
    }

    @Override
    protected void buildString(String str) {
        buffer.append(" ** " + str + "\n");
        buffer.append("\n");
    }

    @Override
    protected void buildItems(String[] items) {
        for (int i=0;i<items.length;i++) {
            buffer.append("      ~" + items[i] + "\n");
        }
        buffer.append("\n");
    }

    @Override
    protected void buildClose() {
        buffer.append("=================================\n");
    }

    public String getResult() {
        return buffer.toString();
    }
}
