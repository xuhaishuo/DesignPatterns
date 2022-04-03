package com.xhs.visitor;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/4/1 11:03
 * @since
 */
public interface Element {

    /***
     * @description 接收访问者
     * 
     * @param visitor 访问者
     * @return void
     * @author 徐海硕
     * @create_at 2022/4/1 11:03
     * @since 
     */
    void accept(Visitor visitor);
}
