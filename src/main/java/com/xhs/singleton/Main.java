package com.xhs.singleton;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/3/25 10:47
 * @since
 */
public class Main {
  public static void main(String[] args) {
//      Singleton singleton1 = Singleton.getInstance();
//      Singleton singleton2 = Singleton.getInstance();
//      if (singleton1 == singleton2) {
//        System.out.println("相同的实例");
//      } else {
//          System.out.println("不同的实例");
//      }

//      TicketMarker ticketMarker = TicketMarker.getInstance();
//      System.out.println(ticketMarker.getNextTickerNumber());
//      System.out.println(ticketMarker.getNextTickerNumber());
//      System.out.println(ticketMarker.getNextTickerNumber());

      Triple triple1 = Triple.getInstance(1);
      Triple triple2 = Triple.getInstance(2);
      Triple triple3 = Triple.getInstance(3);
      Triple triple22 = Triple.getInstance(2);
      System.out.println(triple1);
      System.out.println(triple2);
      System.out.println(triple3);
      System.out.println(triple22);
  }
}
