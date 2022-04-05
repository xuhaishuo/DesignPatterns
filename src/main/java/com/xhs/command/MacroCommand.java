package com.xhs.command;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author haishuo.xu
 * @description 多条命令整合的命令 =》 整合命令
 * @create_at 2022/4/4 15:53
 * @since
 */
public class MacroCommand implements Command {
    /** 命令的集合 */
    private Stack commands = new Stack();

    /***
     * @description 执行集合中的命令
     * 
     * @param
     * @return void
     * @author 徐海硕
     * @create_at 2022/4/4 15:55
     * @since 
     */
    @Override
    public void execute() {
        Iterator iterator = commands.iterator();
        while (iterator.hasNext()) {
            ((Command) iterator.next()).execute();
        }
    }

    /** 添加命令 */
    public void append(Command command) {
        if (command != this) {
            commands.push(command);
        }
    }

    /** 删除最后一条命令 */
    public void undo() {
        if (!commands.empty()) {
            commands.pop();
        }
    }

    /** 删除所有命令 */
    public void clear() {
        commands.clear();
    }
}
