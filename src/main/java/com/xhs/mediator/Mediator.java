package com.xhs.mediator;

/**
 * @author haishuo.xu
 * @description 仲裁者接口
 * @create_at 2022/4/2 11:32
 * @since
 */
public interface Mediator {

    /***
     * @description 生成要管理的组员
     * 
     * @param
     * @return void
     * @author 徐海硕
     * @create_at 2022/4/2 11:33
     * @since 
     */
    void createColleagues();

    /***
     * @description 组员向仲裁者进行报告
     * 
     * @param
     * @return void
     * @author 徐海硕
     * @create_at 2022/4/2 11:34
     * @since 
     */
    void colleagueChanged();

}
