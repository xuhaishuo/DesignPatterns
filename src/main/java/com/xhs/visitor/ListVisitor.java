package com.xhs.visitor;

import java.util.Iterator;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/4/1 11:16
 * @since
 */
public class ListVisitor extends Visitor {
    private String currentDir = "";

    @Override
    public void visit(File file) {
        System.out.println(currentDir + "/" + file);

    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentDir + "/" + directory);
        String saveDir = currentDir;
        currentDir = currentDir + "/" + directory.getName();
        Iterator iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry entry = (Entry) iterator.next();
            entry.accept(this);
        }
        currentDir = saveDir;
    }
}
