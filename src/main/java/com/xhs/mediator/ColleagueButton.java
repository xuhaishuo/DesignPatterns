package com.xhs.mediator;

import java.awt.*;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/4/2 11:37
 * @since
 */
public class ColleagueButton extends Button implements Colleague {
    private Mediator mediator;

    public ColleagueButton(String caption) {
        super(caption);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;

    }

    @Override
    public void setColleagueEnable(boolean enabled) {
        // 启动或禁用控件
        setEnabled(enabled);
    }
}
