package com.xhs.observer;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/4/3 10:34
 * @since
 */
public class GraphObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.println("GraphObserver: ");
        int number = generator.getNumber();
        for (int i=0;i<number;i++) {
            System.out.print("*");
        }
        System.out.println("");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
