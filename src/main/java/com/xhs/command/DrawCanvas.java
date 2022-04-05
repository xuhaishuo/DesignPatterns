package com.xhs.command;

import java.awt.*;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/4/4 16:02
 * @since
 */
public class DrawCanvas extends Canvas implements Drawable {
    /** 颜色 */
    private Color color = Color.red;
    /** 要绘制的圆点的半径 */
    private int radius = 6;
    /** 命令的历史记录 */
    private MacroCommand history;

    public DrawCanvas(int width, int height,MacroCommand history) {
        setSize(width, height);
        setBackground(Color.white);
        this.history = history;
    }

    /** 重新全部绘制 */
    @Override
    public void paint(Graphics g) {
        history.execute();
    }

    /** 绘制 */
    @Override
    public void draw(int x, int y) {
        Graphics graphics = getGraphics();
        graphics.setColor(color);
        graphics.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}
