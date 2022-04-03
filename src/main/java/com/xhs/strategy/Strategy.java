package com.xhs.strategy;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/3/31 10:53
 * @since
 */
public interface Strategy {

    /***
     * @description 获取下一局要出的手势
     * 
     * @param
     * @return com.xhs.strategy.Hand
     * @author 徐海硕
     * @create_at 2022/3/31 10:54
     * @since 
     */
    Hand nextHand();

    /***
     * @description 学习上一局的手势是否获胜了
     * 
     * @param win
     * @return void
     * @author 徐海硕
     * @create_at 2022/3/31 10:54
     * @since 
     */
    void study(boolean win);
}
