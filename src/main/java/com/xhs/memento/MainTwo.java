package com.xhs.memento;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author haishuo.xu
 * @description 读取文件，保存游戏
 * @create_at 2022/4/3 11:44
 * @since
 */
public class MainTwo {
    public static final String FILENAME = "game.dat";

    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = loadMemento();

        if (memento != null) {
            System.out.println("读取上次保存存档开始游戏...");
            // 从文件中加载
            gamer.restoreMemento(memento);
        } else {
            System.out.println("新游戏开始了");
            memento = gamer.createMemento();
        }

        for (int i=1;i<=100;i++) {
            System.out.println("====" + i);
            System.out.println("当前状态: " + gamer);

            // 进行游戏
            gamer.bet();

            System.out.println("所持金钱为: " + gamer.getMoney() + " 元");

            // 决定如何处理Memento
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("    (所持金钱增加了许多，因此保存游戏当前的状态)");
                memento = gamer.createMemento();
                // 保存到文件中
                saveMemento(memento);
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("    (所持金钱减少了许多，因此将游戏恢复至以前的状态)");
                gamer.restoreMemento(memento);
            }

            // 等待一段时间
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("======== 开始下一局, 当前第" + i + "局 ========");
        }
    }


    /***
     * @description 保存对象到文件中
     * 
     * @param memento
     * @return void
     * @author 徐海硕
     * @create_at 2022/4/3 11:56
     * @since 
     */
    public static void saveMemento(Memento memento) {
        ObjectOutputStream outputStream = null;
        try {
            outputStream = new ObjectOutputStream(new FileOutputStream(FILENAME));
            outputStream.writeObject(memento);
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Memento loadMemento() {
        Memento memento = null;
        try {
            ObjectInputStream stream = new ObjectInputStream(new FileInputStream(FILENAME));
            memento = (Memento) stream.readObject();
            stream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return memento;
    }

}
