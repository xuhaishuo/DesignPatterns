package com.xhs.chanOfResponsibility;

/**
 * @author haishuo.xu
 * @description 不解决问题的类
 * @create_at 2022/4/2 9:53
 * @since
 */
public class NoSupport extends Support {

    public NoSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
