package com.xhs.composite;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/3/31 12:20
 * @since
 */
public abstract class Entry {
    protected Entry parent;

    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatMentException {
        throw new FileTreatMentException();
    }

    public void printList() {
        printList("");
    }

    protected abstract void printList(String prefix);

    public String getFullName() {
        StringBuffer stringBuffer = new StringBuffer();
        Entry entry = this;
        do {
            stringBuffer.insert(0,"/" + entry.getName());
            entry = entry.parent;
        } while (entry != null);
        return stringBuffer.toString();
    }


    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
