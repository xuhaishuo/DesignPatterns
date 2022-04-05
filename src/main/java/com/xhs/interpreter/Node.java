package com.xhs.interpreter;

/**
 * @author haishuo.xu
 * @description 语法树中各个部分(节点)中最顶层的类
 * @create_at 2022/4/5 9:49
 * @since
 */
public abstract class Node {

    /** 语法解析处理 */
    public abstract void parse(Context context) throws ParseException;
}
