package com.xhs.facade;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author haishuo.xu
 * @description 模拟连接数据库
 * @create_at 2022/4/2 10:39
 * @since
 */
public class Database {

    private Database() {}

    public static Properties getProperties(String filename) {
//        String filename = name + ".txt";
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(filename));
        } catch (IOException e) {
            System.out.println("Warning: " + filename + " is not found.");
        }
        return properties;
    }
}
