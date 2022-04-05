package com.xhs.interpreter;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/4/5 9:51
 * @since
 */
public class ProgramNode extends Node {
    private Node commandListNode;

    @Override
    public void parse(Context context) throws ParseException {
        context.skipToken("program");
        commandListNode = new CommandListNode();
        commandListNode.parse(context);

    }


    @Override
    public String toString() {
        return "[program " + commandListNode + " ]";
    }


}
