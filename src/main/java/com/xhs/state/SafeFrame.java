package com.xhs.state;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author haishuo.xu
 * @description 使用GUI实现警报系统界面
 * @create_at 2022/4/3 13:21
 * @since
 */
public class SafeFrame extends Frame implements ActionListener, Context {
    /** 显示当前的时间 */
    private TextField textClock = new TextField(60);
    /** 显示警报中心的记录 */
    private TextArea textScreen = new TextArea(10, 60);
    private Button buttonUse = new Button("使用金库");
    private Button buttonAlarm = new Button("按下警铃");
    private Button buttonPhone = new Button("正常通话");
    private Button buttonExit = new Button("结束");

    /** 当前的状态 */
    private State state = DayState.getInstance();

    public SafeFrame(String title) {
        super(title);
        setBackground(Color.lightGray);
        setLayout(new BorderLayout());
        // 配置 textClock
        add(textClock, BorderLayout.NORTH);
        textClock.setEditable(false);
        // 配置 textScreen
        add(textScreen, BorderLayout.CENTER);
        textScreen.setEditable(false);
        // 为界面添加按钮
        Panel panel = new Panel();
        panel.add(buttonUse);
        panel.add(buttonAlarm);
        panel.add(buttonPhone);
        panel.add(buttonExit);
        // 配置界面
        add(panel, BorderLayout.SOUTH);
        // 显示
        pack();
        show();
        // 设置监听器
        buttonUse.addActionListener(this);
        buttonAlarm.addActionListener(this);
        buttonPhone.addActionListener(this);
        buttonExit.addActionListener(this);
    }


    /** 设置时间 */
    @Override
    public void setClock(int hour) {
        String clockString = "现在时间是 ";
        if (hour < 10) {
            clockString += "0" + hour + ":00";
        } else {
            clockString += hour + ":00";
        }
        System.out.println(clockString);
        textClock.setText(clockString);
        state.doClock(this, hour);
    }

    /** 改变状态 */
    @Override
    public void changeState(State state) {
        System.out.println("从 " + this.state + " 状态改变为了 " + state + " 状态");
        this.state = state;
    }

    /** 联系警报中心 */
    @Override
    public void callSecurityCenter(String msg) {
        textScreen.append("call " + msg + "\n");
    }

    /** 在警报中心留下记录 */
    @Override
    public void recordLog(String msg) {
        textScreen.append("record ... " + msg + "\n");
    }

    /** 按下按钮后改方法会被调用 */
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        if (e.getSource() == buttonUse) {
            // 金库按钮使用
            state.doUser(this);
        } else if (e.getSource() == buttonAlarm) {
            // 按下警铃按钮
            state.doAlarm(this);
        } else if (e.getSource() == buttonPhone) {
            // 正常通话按钮
            state.doPhone(this);
        } else if (e.getSource() == buttonExit) {
            // 结束按钮
            System.exit(0);
        } else {
            System.out.println("?");
        }
    }
}
