package com.xhs.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/4/5 9:53
 * @since
 */
public class CommandListNode extends Node {
    private List list = new ArrayList();

    @Override
    public void parse(Context context) throws ParseException {
        while (true) {
            if (context.currentToken() == null) {
                throw new ParseException("Missing 'end'");
            } else if (context.currentToken().equals("end")) {
                context.skipToken("end");
                break;
            } else {
                Node commandNode = new CommandNode();
                commandNode.parse(context);
                list.add(commandNode);
            }
        }
    }


    @Override
    public String toString() {
        return list.toString();
    }


}
