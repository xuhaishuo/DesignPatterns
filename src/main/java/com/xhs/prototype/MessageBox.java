package com.xhs.prototype;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/3/26 11:47
 * @since
 */
public class MessageBox extends AbstractProduct {
    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        for (int i=0;i<length+4;i++) {
            System.out.print(decochar);
        }
        System.out.println("");
        System.out.println(decochar+ " " + s + " " + decochar);
        for (int i=0;i<length+4;i++) {
            System.out.print(decochar);
        }
        System.out.println("");
    }
}
