package com.xhs.strategy;

import java.math.BigDecimal;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/3/31 11:42
 * @since
 */
public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Main randomseed1 randomseed2");
            System.out.println("Example: java Main 314 15");
            System.exit(0);
        }
        int seed1 = Integer.parseInt(args[0]);
        int seed2 = Integer.parseInt(args[1]);
        Player taro = new Player("Taro", new WinnerStrategy(seed1));
        Player hana = new Player("Hana", new ProbStrategy(seed2));

        for (int i=0;i<10000;i++) {
            Hand nextHand1 = taro.nextHand();
            Hand nextHand2 = hana.nextHand();
            if (nextHand1.isStrongerThan(nextHand2)) {
                System.out.println("Winner: " + taro);
                taro.win();
                hana.lose();
            } else if (nextHand2.isStrongerThan(nextHand1)) {
                System.out.println("Winner: " + hana);
                hana.win();
                taro.lose();
            } else {
                System.out.println("Even...");
                taro.even();
                hana.even();
            }
        }

        System.out.println("Total result");
        System.out.println(taro);
        System.out.println(hana);
    }
}
