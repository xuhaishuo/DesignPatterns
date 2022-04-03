package com.xhs.adapter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/3/22 10:20
 * @since
 */
public class FileProperties extends Properties implements FileIO {

    @Override
    public void readFromFile(String filename) throws IOException {
        this.load(new FileInputStream(filename));
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        this.store(new FileOutputStream(filename), null);
    }

    @Override
    public void setValue(String key, String value) {
        this.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return this.getProperty(key);
    }
}
