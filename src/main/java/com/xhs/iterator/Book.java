package com.xhs.iterator;

/**
 * @author haishuo.xu
 * @description 实体：书
 * @create_at 2022/3/21 11:30
 * @since
 */
public class Book {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}
