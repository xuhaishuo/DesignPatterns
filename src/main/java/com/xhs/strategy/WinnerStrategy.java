package com.xhs.strategy;

import java.util.Random;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/3/31 10:55
 * @since
 */
public class WinnerStrategy implements Strategy {
    private Random random;
    private boolean won = false;
    private Hand prevHand;

    public WinnerStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if (!won) {
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
