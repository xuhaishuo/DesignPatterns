package com.xhs.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author haishuo.xu
 * @description 具体的集合
 * @create_at 2022/3/21 11:31
 * @since
 */
public class BookShelf implements Aggregate{
    //private Book[] books;
    private int last = 0;
    private List<Book> books;

    public BookShelf(int maxSize) {
        //books = new Book[maxSize];
        books = new ArrayList<Book>(maxSize);
    }

    public Book getBookAt(int index) {
        //return books[index];
        return books.get(index);
    }

    public void appendBook(Book book) {
        // this.books[last] = book;
        books.add(book);
        last++;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
