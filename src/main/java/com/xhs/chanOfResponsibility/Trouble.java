package com.xhs.chanOfResponsibility;

/**
 * @author haishuo.xu
 * @description 表示发生的问题的类
 * @create_at 2022/4/2 9:39
 * @since
 */
public class Trouble {
    /** 问题编号 */
    private int number;

    public Trouble(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "[Trouble " + number + "]";
    }
}
