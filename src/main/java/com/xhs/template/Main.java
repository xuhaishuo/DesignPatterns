package com.xhs.template;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/3/23 14:49
 * @since
 */
public class Main {
  public static void main(String[] args) {
      AbstractDisplay charDisplay = new CharDisplay('H');
      charDisplay.display();

      AbstractDisplay stringDisplay = new StringDisplay("Hello, world.");
      stringDisplay.display();
  }
}
