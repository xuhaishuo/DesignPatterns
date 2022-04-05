package com.xhs.flyWeight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author haishuo.xu
 * @description 表示大型字符的类
 * @create_at 2022/4/4 14:26
 * @since
 */
public class BigChar {
    /** 字符名字 */
    private char charName;
    /** 大型字符对于的字符串(由 '#' '.' '\n' 组成) */
    private String fontData;

    public BigChar(char charName) {
        this.charName = charName;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("big" + charName + ".txt"));
            String line;
            StringBuffer buffer = new StringBuffer();
            while ((line = reader.readLine()) != null) {
                buffer.append(line);
                buffer.append("\n");
            }
            reader.close();
            this.fontData = buffer.toString();
        } catch (IOException e) {
            this.fontData = charName + "?";
        }
    }

    /***
     * @description 显示字符串
     * 
     * @param
     * @return void
     * @author 徐海硕
     * @create_at 2022/4/4 14:30
     * @since 
     */
    public void print() {
        System.out.print(fontData);
    }
}
