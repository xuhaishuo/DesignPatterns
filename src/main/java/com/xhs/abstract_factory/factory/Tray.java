package com.xhs.abstract_factory.factory;

import java.util.ArrayList;

/**
 * @author haishuo.xu
 * @description 抽象零件
 * @create_at 2022/3/28 9:03
 * @since
 */
public abstract class Tray extends Item {
    protected ArrayList tray = new ArrayList();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        tray.add(item);
    }
}
