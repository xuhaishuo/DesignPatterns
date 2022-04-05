package com.xhs.proxy;

/**
 * @author haishuo.xu
 * @description 接口 =》 代理类 和 被代理类(原类) 共同实现的接口
 * @create_at 2022/4/4 15:10
 * @since
 */
@SuppressWarnings("all")
public interface Printable {

    /** 设置名字 */
    void setPrinterName(String name);

    /** 获取名字 */
    String getPrinterName();

    /** 显示文字(打印输出) */
    void print(String string);
}
