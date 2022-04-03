package com.xhs.singleton;

/**
 * @author haishuo.xu
 * @description 懒汉式在多线程中会有问题
 * @create_at 2022/3/25 10:45
 * @since
 */
public class Singleton {
    // private static Singleton singleton = new Singleton(); // 饿汉式
    private static Singleton singleton = null;  // 懒汉式

    private Singleton() {
        System.out.println("生成了一个实例...");
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
