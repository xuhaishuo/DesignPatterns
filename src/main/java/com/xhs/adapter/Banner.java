package com.xhs.adapter;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/3/22 9:36
 * @since
 */
public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
