package com.xhs.state;

/**
 * @author haishuo.xu
 * @description 表示晚上的状态 => 单例
 * @create_at 2022/4/3 13:17
 * @since
 */
public class NightState implements State {
    private static NightState singleton = new NightState();

    private NightState() {}

    public static NightState getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (hour >= 9 && hour <= 17) {
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUser(Context context) {
        context.callSecurityCenter("紧急： 晚上使用金库");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警铃 (晚上)");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("晚上的通话录音");
    }

    @Override
    public String toString() {
        return "[ 晚上 ]";
    }
}
