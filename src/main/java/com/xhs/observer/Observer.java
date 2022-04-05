package com.xhs.observer;

/**
 * @author haishuo.xu
 * @description 观察者接口
 * @create_at 2022/4/3 10:25
 * @since
 */
public interface Observer {

    /***
     * @description 接收通知
     * 
     * @param generator
     * @return void
     * @author 徐海硕
     * @create_at 2022/4/3 10:27
     * @since 
     */
    void update(NumberGenerator generator);
}
