package com.xhs.iterator;

/**
 * @author haishuo.xu
 * @description
 * @create_at 2022/3/21 11:38
 * @since
 */
public class Main {
  public static void main(String[] args) {
      BookShelf bookShelf = new BookShelf(4);
      bookShelf.appendBook(new Book("图解设计模式"));
      bookShelf.appendBook(new Book("流畅的Python"));
      bookShelf.appendBook(new Book("Java核心技术卷1"));
      bookShelf.appendBook(new Book("算法图解"));
      Iterator iterator = bookShelf.iterator();
      while (iterator.hasNext()) {
        System.out.println(iterator.next());
      }
  }
}
