package com.xhs.decorator;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/4/1 9:57
 * @since
 */
public class Main {
    public static void main(String[] args) {
        Display b1 = new StringDisplay("Hello, world.");
        Display b2 = new SideBorder(b1, '#');
        Display b3 = new FullBorder(b2);

        b1.show();
        b2.show();
        b3.show();
        System.out.println(" =========================== ");

        Display b4 = new SideBorder(
                new FullBorder(
                        new FullBorder(
                                new SideBorder(
                                        new FullBorder(
                                                new StringDisplay("你好，世界")), '*'))), '/');

        b4.show();
        System.out.println(" =========================== ");

        Display b5 = new FullBorder(
                new UpDownBorder(
                        new SideBorder(
                                new UpDownBorder(
                                        new SideBorder(
                                                new StringDisplay(" Hello, World "),'*'),'='),'|'),'/'));

        b5.show();
        System.out.println(" =========================== ");

        MultiStringDisplay stringDisplay = new MultiStringDisplay();
        stringDisplay.add("早上好");
        stringDisplay.add("下午好");
        stringDisplay.add("晚安，明天见");
        stringDisplay.show();

        Display d1 = new SideBorder(stringDisplay, '#');
        d1.show();

        Display d2 = new FullBorder(stringDisplay);
        d2.show();


    }
}
