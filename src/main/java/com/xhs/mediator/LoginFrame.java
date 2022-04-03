package com.xhs.mediator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/4/2 11:48
 * @since
 */
public class LoginFrame extends Frame implements ActionListener, Mediator {
    private ColleagueCheckbox checkGuest;
    private ColleagueCheckbox checkLogin;
    private ColleagueTextField textUser;
    private ColleagueTextField textPass;
    private ColleagueButton buttonOk;
    private ColleagueButton buttonCancel;

    public LoginFrame(String title) {
        super(title);
        setBackground(Color.lightGray);
        // 使用布局管理器生成4*2窗格
        setLayout(new GridLayout(4,2));
        // 生成各个Colleague
        createColleagues();
        // 配置
        add(checkGuest);
        add(checkLogin);
        add(new Label("Username:"));
        add(textUser);
        add(new Label("Password:"));
        add(textPass);
        add(buttonOk);
        add(buttonCancel);
        // 设置初始的启用/禁用状态
        colleagueChanged();
        // 显示
        pack();
        show();
    }

    /** 生成各个Colleagues */
    @Override
    public void createColleagues() {
        // 生成
        CheckboxGroup g = new CheckboxGroup();
        checkGuest = new ColleagueCheckbox("Guest", g, true);
        checkLogin = new ColleagueCheckbox("Login", g, false );
        textUser = new ColleagueTextField("", 10);
        textPass = new ColleagueTextField("", 10);
        textPass.setEchoChar('*');
        buttonOk = new ColleagueButton("OK");
        buttonCancel = new ColleagueButton("Cancel");

        // 设置
        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        textUser.setMediator(this);
        textPass.setMediator(this);
        buttonOk.setMediator(this);
        buttonCancel.setMediator(this);

        // 设置Listener
        checkGuest.addItemListener(checkGuest);
        checkLogin.addItemListener(checkLogin);
        textUser.addTextListener(textUser);
        textPass.addTextListener(textPass);
        buttonOk.addActionListener(this);
        buttonCancel.addActionListener(this);
    }

    /** 接收来自各个Colleague的通知，然后判断Colleague的启动/禁用状态 */
    @Override
    public void colleagueChanged() {
        if (checkGuest.getState()) {
            textUser.setColleagueEnable(false);
            textPass.setColleagueEnable(false);
            buttonOk.setColleagueEnable(true);
        } else {
            textUser.setColleagueEnable(true);
            userpassChanged();
        }
    }

    /** 当textUser或textPass文本输入框种的文字发生变化时，判断各Colleague的启用/禁用状态 */
    private void userpassChanged() {
        if (textUser.getText().length() > 0) {
            textPass.setColleagueEnable(true);
            if (textPass.getText().length() > 0) {
                buttonOk.setColleagueEnable(true);
            } else {
                buttonOk.setColleagueEnable(false);
            }
        } else {
            textPass.setColleagueEnable(false);
            buttonOk.setColleagueEnable(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        System.exit(0);
    }
}
