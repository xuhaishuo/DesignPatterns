package com.xhs.strategy;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/3/31 9:51
 * @since
 */
public class Hand {
    /** 表示石头的值 */
    public static final int HAND_VALUE_GUU = 0;
    /** 表示剪刀的值 */
    public static final int HAND_VALUE_CHO = 1;
    /** 表示布的值 */
    public static final int HAND_VALUE_PAA = 2;

    /** 表示猜拳中3种手势的实例 */
    public static final Hand[] hand = {
            new Hand(HAND_VALUE_GUU),
            new Hand(HAND_VALUE_CHO),
            new Hand(HAND_VALUE_PAA),
    };
    /** 表示猜拳中手势所对应的字符串 */
    private static final String[] name = {
            "石头","剪刀","布"
    };

    private int handValue;

    public Hand(int handValue) {
        this.handValue = handValue;
    }

    public static Hand getHand(int handValue) {
        return hand[handValue];
    }

    public boolean isStrongerThan(Hand h) {
        return fight(h) == 1;
    }

    public boolean isWeakerThan(Hand h) {
        return fight(h) == -1;
    }

    /***
     * @description 计分：0 平，1 胜， -1 负
     * 
     * @param h
     * @return int
     * @author 徐海硕
     * @create_at 2022/3/31 10:52
     * @since 
     */
    private int fight(Hand h) {
        if (this == h) {
            return 0;
        } else if ((this.handValue + 1) % 3 == h.handValue) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return name[handValue];
    }


}
