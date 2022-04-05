package com.xhs.state;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/4/3 14:07
 * @since
 */
public class LunchState implements State {
    private static LunchState singleton = new LunchState();

    private LunchState() {}

    private static LunchState getInstance() {
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if ((hour < 12 && hour >= 9) || (hour >= 13 && hour <= 17)) {
            context.changeState(DayState.getInstance());
        }
    }

    @Override
    public void doUser(Context context) {
        context.callSecurityCenter("使用金库 - 紧急情况 [午餐]");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("按下警铃 - 紧急情况 [午餐]");
    }

    @Override
    public void doPhone(Context context) {
        context.recordLog("使用电话 - 留言 [午餐]");
    }

    @Override
    public String toString() {
        return "[ 午餐 ]";
    }
}
