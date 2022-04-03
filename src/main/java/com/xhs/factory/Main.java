package com.xhs.factory;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/3/24 10:47
 * @since
 */
public class Main {
  public static void main(String[] args) {
      Factory factory = new IDCardFactory();
      Product ming = factory.create("小明", 1);
      Product hong = factory.create("小红", 2);
      Product gang = factory.create("小刚", 3);

      ming.use();
      hong.use();
      gang.use();
  }
}
