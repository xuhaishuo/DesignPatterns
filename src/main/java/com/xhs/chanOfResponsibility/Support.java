package com.xhs.chanOfResponsibility;

/**
 * @author haishuo.xu
 * @description 解决问题的抽象类
 * @create_at 2022/4/2 9:41
 * @since
 */
public abstract class Support {
    private String name;
    private Support next;

    public Support(String name) {
        this.name = name;
    }

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    /** 解决问题的步骤 */
    public final void support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
        } else if (next != null) {
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }

    /** 解决问题的步骤 - 循环调用 */
    public final void support2(Trouble trouble) {
        for (Support obj = this;true;obj = obj.next) {
            if (obj.resolve(trouble)) {
                obj.done(trouble);
                break;
            } else if (obj.next == null) {
                fail(trouble);
                break;
            }
        }
    }

    /** 解决问题的步骤 - 循环调用 */
    public final void support3(Trouble trouble) {
        Support tmp = this;
        while (tmp != null) {
            if (tmp.resolve(trouble)) {
                tmp.done(trouble);
                return;
            }
            tmp = tmp.next;
        }
        fail(trouble);
    }



    /** 解决问题的方法 */
    protected abstract boolean resolve(Trouble trouble);

    /** 解决 */
    protected void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by " + this + ".");
    }

    /** 未解决 */
    protected void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved");
    }

    @Override
    public String toString() {
        return "[" + name + "]";
    }
}
