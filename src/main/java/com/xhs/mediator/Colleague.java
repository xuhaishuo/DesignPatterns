package com.xhs.mediator;

/**
 * @author haishuo.xu
 * @description 向仲裁者进行报告的组员的接口
 * @create_at 2022/4/2 11:34
 * @since
 */
public interface Colleague {

    /**
     * @description 设置仲裁者
     * 
     * @param mediator
     * @return void
     * @author 徐海硕
     * @create_at 2022/4/2 11:35
     * @since 
     */
    void setMediator(Mediator mediator);

    /***
     * @description 告知组员仲裁者下达的指令
     *
     * @param enabled true: 启动状态，false: 禁用状态
     * @return void
     * @author 徐海硕
     * @create_at 2022/4/2 11:36
     * @since
     */
    void setColleagueEnable(boolean enabled);
}
