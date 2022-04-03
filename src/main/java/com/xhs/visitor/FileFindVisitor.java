package com.xhs.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/4/1 11:58
 * @since
 */
public class FileFindVisitor extends Visitor {
    private List list = new ArrayList();
    private String str;

    public FileFindVisitor(String str) {
        this.str = str;
    }

    public Iterator getFoundFiles() {
        return list.iterator();
    }

    @Override
    public void visit(File file) {
        if (file.getName().endsWith(str)) {
            list.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        Iterator iterator = directory.iterator();
        while (iterator.hasNext()) {
            Entry entry = (Entry) iterator.next();
            entry.accept(this);
        }
    }
}
