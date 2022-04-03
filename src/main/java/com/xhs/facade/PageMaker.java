package com.xhs.facade;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author haishuo.xu
 * @description 生成web页面
 * @create_at 2022/4/2 10:47
 * @since
 */
public class PageMaker {
    private PageMaker() {}

    public static void makeWelcomePage(String mailAddress, String filename) {
        try {
            Properties properties = Database.getProperties("D:\\Java\\Frame\\DesignPatterns\\src\\main\\resources\\maildata.properties");
            String username = properties.getProperty(mailAddress);
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Welcome to " + username + "'s page!");
            writer.paragraph(username + "欢迎来到 " + username + " 的主页");
            writer.paragraph("等着你的邮件");
            writer.mailto(mailAddress, username);
            writer.close();
            System.out.println(filename + " is created for " + mailAddress + " (" + username + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
