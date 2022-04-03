package com.xhs.bridge;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/3/29 12:03
 * @since
 */
public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times) {
        open();
        for (int i=0;i<times;i++) {
            print();
        }
        close();
    }
}
