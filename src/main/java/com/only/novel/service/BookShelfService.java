package com.only.novel.service;

import com.only.novel.entity.BookShelf;

import java.util.List;

public interface BookShelfService {
    public List<BookShelf> getBookShelfList();
    public int addBookShelf(BookShelf bookShelf);
    public int updateBookShelf(BookShelf bookShelf);
    public int deleteBookShelf(BookShelf bookShelf);
}
