package com.xhs.prototype;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/3/26 11:56
 * @since
 */
public class UnderlinePen extends AbstractProduct {
    private char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("\"" + s + "\"");
        System.out.print(" ");
        for (int i=0;i<length;i++) {
            System.out.print(ulchar);
        }
        System.out.println("");
    }
}
