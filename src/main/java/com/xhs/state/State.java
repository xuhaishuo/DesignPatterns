package com.xhs.state;

/**
 * @author haishuo.xu
 * @description 金库状态的接口
 * @create_at 2022/4/3 13:07
 * @since
 */
@SuppressWarnings("all")
public interface State {

    /** 设置时间 */
    void doClock(Context context, int hour);

    /** 使用金库 */
    void doUser(Context context);

    /** 按下警铃 */
    void doAlarm(Context context);

    /** 正常通话 */
    void doPhone(Context context);

}
