package com.xhs.mediator;

import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/4/2 11:41
 * @since
 */
public class ColleagueTextField extends TextField implements TextListener, Colleague {
    private Mediator mediator;

    public ColleagueTextField(String text, int columns) {
        super(text, columns);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnable(boolean enabled) {
        // 启动或禁用控件
        setEnabled(enabled);
        // 启动或禁用控件时的颜色
        setBackground(enabled ? Color.white : Color.lightGray);
    }

    @Override
    public void textValueChanged(TextEvent e) {
        // 当文字发生变化时，向仲裁者报告
        mediator.colleagueChanged();
    }
}
