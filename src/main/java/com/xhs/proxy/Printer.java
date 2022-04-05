package com.xhs.proxy;

/**
 * @author haishuo.xu
 * @description 被代理类 => 原类
 * @create_at 2022/4/4 15:15
 * @since
 */
public class Printer implements Printable {
    private String name;

    public Printer() {
    }

    public Printer(String name) {
        this.name = name;
        heavyJob("Printer 的实例生成中 (" + name + ")");
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        System.out.println("=== " + name + " ===");
        System.out.println(string);
    }

    private void heavyJob(String msg) {
        System.out.print(msg);
        for (int i=0;i<5;i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(".");
        }
        System.out.println("结束");
    }
}
