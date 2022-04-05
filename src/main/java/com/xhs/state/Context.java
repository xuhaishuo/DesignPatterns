package com.xhs.state;

/**
 * @author haishuo.xu
 * @description 负责管理状态和联系警报中心
 * @create_at 2022/4/3 13:07
 * @since
 */
@SuppressWarnings("all")
public interface Context {

    /** 设置时间 */
    void setClock(int hour);

    /** 改变状态 */
    void changeState(State state);

    /** 联系警报中心 */
    void callSecurityCenter(String msg);

    /** 在警报中心中留下记录 */
    void recordLog(String msg);
}
