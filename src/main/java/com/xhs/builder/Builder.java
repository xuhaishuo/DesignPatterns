package com.xhs.builder;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/3/27 9:06
 * @since
 */
public abstract class Builder {
    private boolean flag = false;

    public void makeTitle(String title) {
        if (!flag) {
            flag = true;
            buildTitle(title);
        }
    }

    public void makeString(String str) {
        if (flag) {
            buildString(str);
        }
    }

    public void makeItems(String[] items) {
        if (flag) {
            buildItems(items);
        }
    }

    public void close() {
        if (flag) {
            buildClose();
        }
    }

    protected abstract void buildTitle(String title);

    protected abstract void buildString(String str);

    protected abstract void buildItems(String[] items);

    protected abstract void buildClose();
}
