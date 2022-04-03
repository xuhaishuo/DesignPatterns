package com.xhs.visitor;

import java.util.Iterator;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/4/1 11:05
 * @since
 */
public abstract class Entry implements Element {

    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    public Iterator iterator() throws FileTreatmentException {
        throw new FileTreatmentException();
    }

    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
