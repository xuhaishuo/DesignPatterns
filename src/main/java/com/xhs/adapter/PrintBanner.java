package com.xhs.adapter;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/3/22 9:38
 * @since
 */
public class PrintBanner extends Banner implements Print{

    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeek() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
