package com.xhs.decorator;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/4/1 9:53
 * @since
 */
public class FullBorder extends Border {

    protected FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override
    public int getRows() {
        return 1 + display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else if (row == display.getRows() + 1) {
            return "+" + makeLine('-', display.getColumns()) + "+";
        } else {
            return "|" + display.getRowText(row-1) + "|";
        }
    }

    private String makeLine(char ch, int count) {
        StringBuffer buffer = new StringBuffer();
        for (int i=0;i<count;i++) {
            buffer.append(ch);
        }
        return buffer.toString();
    }
}
