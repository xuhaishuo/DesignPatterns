package com.xhs.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author haishuo.xu
 * @description 生成数值的抽象类
 * @create_at 2022/4/3 10:25
 * @since
 */
public abstract class NumberGenerator {
    /** 保存观察者 */
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    /** 通知观察者们 */
    public void notifyObservers() {
        Iterator<Observer> iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = iterator.next();
            observer.update(this);
        }
    }

    /** 获取数值 */
    public abstract int getNumber();

    /** 生成数值 */
    public abstract void execute();


}
