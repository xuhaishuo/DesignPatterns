package com.xhs.decorator;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/4/1 10:24
 * @since
 */
public class UpDownBorder extends Border {
    private char ch;

    protected UpDownBorder(Display display, char ch) {
        super(display);
        this.ch = ch;
    }

    @Override
    public int getColumns() {
        return display.getColumns();
    }

    @Override
    public int getRows() {
        return 1 + display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return "+" + sub() + "+";
        } else if (row == display.getRows()+1) {
            return "+" + sub() + "+";
        } else {
            return display.getRowText(row-1);
        }
    }

    private String sub() {
        StringBuffer buffer = new StringBuffer();
        for (int i=0;i< display.getColumns();i++) {
            buffer.append(ch);
        }
        return buffer.toString();
    }
}
