package com.xhs.decorator;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/4/1 9:41
 * @since
 */
public abstract class Display {

    /***
     * @description 获取横向字符数
     *
     * @param
     * @return int
     * @author 徐海硕
     * @create_at 2022/4/1 9:42
     * @since
     */
    public abstract int getColumns();

    /***
     * @description 获取纵向行数
     * 
     * @param
     * @return int
     * @author 徐海硕
     * @create_at 2022/4/1 9:43
     * @since 
     */
    public abstract int getRows();

    /***
     * @description 获取指定的某一行字符串
     *
     * @param row
     * @return java.lang.String
     * @author 徐海硕
     * @create_at 2022/4/1 9:44
     * @since
     */
    public abstract String getRowText(int row);

    public final void show() {
        for (int i=0;i<getRows();i++) {
            System.out.println(getRowText(i));
        }
    }
}
