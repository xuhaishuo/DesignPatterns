package com.xhs.decorator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/4/1 10:37
 * @since
 */
public class MultiStringDisplay extends Display {
    List<String> list = new ArrayList<>();

    public void add(String str) {
        list.add(str);
    }

    @Override
    public int getColumns() {
        return 10;
    }

    @Override
    public int getRows() {
        return list.size();
    }

    @Override
    public String getRowText(int row) {
        if (row < list.size()) {
            return list.get(row);
        }
        return null;
    }
}
