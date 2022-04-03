package com.xhs.adapter;

import java.io.IOException;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/3/22 10:18
 * @since
 */
public interface FileIO {

    void readFromFile(String filename) throws IOException;

    void writeToFile(String filename) throws IOException;

    void setValue(String key, String value);

    String getValue(String key);
}
