package com.xhs.command;

import java.awt.*;

/**
 * @author haishuo.xu
 * @description 绘制一个点的命令
 * @create_at 2022/4/4 15:58
 * @since
 */
public class DrawCommand implements Command {
    /** 绘制对象 */
    protected Drawable drawable;
    /** 绘制位置 */
    private Point position;

    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }

    /** 执行命令，开始绘制 */
    @Override
    public void execute() {
        drawable.draw(position.x, position.y);
    }
}
