package com.xhs.proxy;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/4/4 15:24
 * @since
 */
public class Main {
    public static void main(String[] args) {
        PrinterProxy p = new PrinterProxy("Alice");
        System.out.println("现在的名字是: " + p.getPrinterName() + "。");
        p.setPrinterName("Bob");
        System.out.println("现在的名字是: " + p.getPrinterName() + "。");
        p.print("Hello, world.");
    }
}
