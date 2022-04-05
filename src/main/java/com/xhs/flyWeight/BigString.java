package com.xhs.flyWeight;

/**
 * @author haishuo.xu
 * @description 由 BigChar 组成的 "大型字符串" 类
 * @create_at 2022/4/4 14:39
 * @since
 */
public class BigString {
    /** "大型字符" 的数组 */
    private BigChar[] bigChars;

    /** 构造函数，生成数组 */
    public BigString(String string) {
        bigChars = new BigChar[string.length()];
        BigCharFactory bigCharFactory = BigCharFactory.getInstance();
        for (int i=0;i< bigChars.length;i++) {
            bigChars[i] = bigCharFactory.getBigChar(string.charAt(i));
        }
    }

    public BigString(String string, boolean shared) {
        if (shared) {
            bigChars = new BigChar[string.length()];
            BigCharFactory bigCharFactory = BigCharFactory.getInstance();
            for (int i=0;i< bigChars.length;i++) {
                bigChars[i] = bigCharFactory.getBigChar(string.charAt(i));
            }
        } else {
            bigChars = new BigChar[string.length()];
            for (int i=0;i< bigChars.length;i++) {
                bigChars[i] = new BigChar(string.charAt(i));
            }
        }
    }

    /** 显示 */
    public void print() {
        for (int i=0;i< bigChars.length;i++ ) {
            bigChars[i].print();
        }
    }
}
