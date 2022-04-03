package com.xhs.template;

/**
 * @author haishuo.xu
 * @description 抽象类, 具体的实现交给子类
 * @create_at 2022/3/23 14:42
 * @since
 */
public abstract class AbstractDisplay {

    public abstract void open();

    public abstract void print();

    public abstract void close();

    public final void display() {
        open();
        for (int i=0;i<5;i++) {
            print();
        }
        close();
    }
}
