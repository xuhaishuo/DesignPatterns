package com.xhs.adapter;

import java.io.IOException;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/3/22 9:39
 * @since
 */
public class Main {
  public static void main(String[] args) {
      // 使用继承的适配器
      Print hello = new PrintBanner("Hello");
      hello.printWeek();
      hello.printStrong();

      // 使用委托的适配器
      PrintAdaptor hello1 = new PrintBannerAdaptor("hello");
      hello1.printWeek();
      hello1.printStrong();

      // 作业题目
      FileIO f = new FileProperties();
      try {
          f.readFromFile("d:\\file.txt");
          f.setValue("year","2022");
          f.setValue("month","3");
          f.setValue("day","22");
          f.writeToFile("d:\\newfile.txt");
      } catch (IOException e) {
          e.printStackTrace();
      }

  }
}
