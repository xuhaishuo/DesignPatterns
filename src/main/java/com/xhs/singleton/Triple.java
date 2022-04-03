package com.xhs.singleton;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/3/25 10:59
 * @since
 */
public class Triple {
    private int id;

    private static Triple triple1 = new Triple(1);
    private static Triple triple2 = new Triple(2);
    private static Triple triple3 = new Triple(3);

    private Triple(int id) {
        this.id = id;
    }

    public static Triple getInstance(int id) {
        if (id > 3 || id <= 0) {
            return null;
        }
        if (id == 1) {
            return triple1;
        } else if (id == 2) {
            return triple2;
        } else {
            return triple3;
        }
    }
}
