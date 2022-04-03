package com.xhs.visitor;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/4/1 11:02
 * @since
 */
public abstract class Visitor {

    public abstract void visit(File file);

    public abstract void visit(Directory directory);
}
