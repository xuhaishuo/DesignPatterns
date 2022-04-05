package com.xhs.state;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/4/3 13:39
 * @since
 */
public class Main {
    public static void main(String[] args) {
        SafeFrame frame = new SafeFrame("State Sample");
        while (true) {
            for (int hour = 0; hour < 24;hour++) {
                // 设置时间
                frame.setClock(hour);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
