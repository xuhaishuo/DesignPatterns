package com.xhs.strategy;

import java.util.Random;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/3/31 11:55
 * @since
 */
public class RandomStrategy implements Strategy {
    private Random random;

    public RandomStrategy(int seed) {
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        return Hand.getHand(random.nextInt(3));
    }

    @Override
    public void study(boolean win) {

    }
}
