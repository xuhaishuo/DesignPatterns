package com.xhs.chanOfResponsibility;

/**
 * @author haishuo.xu
 * @description 解决奇数编号的问题
 * @create_at 2022/4/2 9:56
 * @since
 */
public class OddSupport extends Support {
    public OddSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() % 2 == 1;
    }
}
