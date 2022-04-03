package com.xhs.bridge;

import java.util.Random;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/3/29 12:22
 * @since
 */
public class RandomDisplay extends Display {
    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int times) {
        open();
        int count = new Random().nextInt(times);
        for (int i=0;i<count;i++) {
            print();
        }
        close();
    }
}
