package com.xhs.memento;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/4/3 11:24
 * @since
 */
public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();

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
}
