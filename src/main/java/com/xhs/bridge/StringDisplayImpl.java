package com.xhs.bridge;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/3/29 12:04
 * @since
 */
public class StringDisplayImpl extends DisplayImpl {
    private String string;
    private int width;

    public StringDisplayImpl(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    public void printLine() {
        System.out.print("+");
        for (int i=0;i<width;i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void rawClose() {
        printLine();
    }
}
