package com.xhs.adapter;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/3/22 9:46
 * @since
 */
public class PrintBannerAdaptor extends PrintAdaptor{
    private Banner banner;

    public PrintBannerAdaptor(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeek() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
