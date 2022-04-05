package com.xhs.observer;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/4/3 10:33
 * @since
 */
public class DigitObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.println("DigitObserver: " + generator.getNumber());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
