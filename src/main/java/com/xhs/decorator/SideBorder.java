package com.xhs.decorator;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/4/1 9:50
 * @since
 */
public class SideBorder extends Border {
    private char borderChar;

    protected SideBorder(Display display, char ch) {
        super(display);
        this.borderChar = ch;
    }

    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        return borderChar + display.getRowText(row) + borderChar;
    }
}
