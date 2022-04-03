package com.xhs.bridge;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/3/29 12:07
 * @since
 */
public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, China."));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));

        RandomDisplay d4 = new RandomDisplay(new StringDisplayImpl("Hello, Random."));

        d1.display();
        d2.display();
        d3.display();
        d3.multiDisplay(5);

        d4.randomDisplay(5);
    }
}
