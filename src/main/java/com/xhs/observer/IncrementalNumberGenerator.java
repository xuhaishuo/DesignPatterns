package com.xhs.observer;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/4/3 10:57
 * @since
 */
public class IncrementalNumberGenerator extends NumberGenerator {
    private int start;
    private int end;
    private int step;

    public IncrementalNumberGenerator(int start, int end, int step) {
        this.start = start;
        this.end = end;
        this.step = step;
    }

    @Override
    public int getNumber() {
        return start;
    }

    @Override
    public void execute() {
        while (start < end) {
            notifyObservers();
            start += step;
        }
    }
}
