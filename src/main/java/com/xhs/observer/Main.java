package com.xhs.observer;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/4/3 10:35
 * @since
 */
public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();
        NumberGenerator incrementalNumberGenerator = new IncrementalNumberGenerator(10, 50, 5);

        Observer digitObserver = new DigitObserver();
        Observer graphObserver = new GraphObserver();

        generator.addObserver(digitObserver);
        generator.addObserver(graphObserver);

        incrementalNumberGenerator.addObserver(digitObserver);
        incrementalNumberGenerator.addObserver(graphObserver);

        // generator.execute();
        incrementalNumberGenerator.execute();
    }
}
