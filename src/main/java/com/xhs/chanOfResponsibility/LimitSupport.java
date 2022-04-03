package com.xhs.chanOfResponsibility;

/**
 * @author haishuo.xu
 * @description 解决编号小于limit的问题
 * @create_at 2022/4/2 9:53
 * @since
 */
public class LimitSupport extends Support {
    private int limit;

    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() < limit;
    }
}
