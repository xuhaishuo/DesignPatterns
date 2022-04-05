package com.xhs.memento;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author haishuo.xu
 * @description 表示Gamer状态的类
 * @create_at 2022/4/3 11:11
 * @since
 */
public class Memento implements Serializable {
    int money;
    ArrayList fruits;

    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList();
    }

    void addFruit(String fruit) {
        fruits.add(fruit);
    }

    List getFruits() {
        // 浅复制
        return (List) fruits.clone();
    }

    public int getMoney() {
        return this.money;
    }
}
