package com.xhs.chanOfResponsibility;

/**
 * @author haishuo.xu
 * @description 解决指定编号的问题
 * @create_at 2022/4/2 9:57
 * @since
 */
public class SpecialSupport extends Support {
    private int number;

    public SpecialSupport(String name, int number) {
        super(name);
        this.number = number;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() == number;
    }
}
