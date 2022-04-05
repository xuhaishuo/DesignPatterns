package com.xhs.flyWeight;

/**
 * @author haishuo.xu
 * @description
 *  垃圾回收四大算法
 *      引用计数法
 *      复制算法
 *      标记清理法
 *      标记压缩法
 * @create_at 2022/4/4 14:43
 * @since
 */
public class Main {
    public static void main(String[] args) {
        BigString bigString = new BigString("1212123");

        bigString.print();
    }
}
