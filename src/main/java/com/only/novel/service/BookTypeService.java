package com.only.novel.service;

import com.only.novel.entity.BookType;

import java.util.List;

public interface BookTypeService {
    public List<BookType> getBookTypeList();
    public int addBookType(BookType bookType);
    public int updateBookType(BookType bookType);
    public int deleteBookType(BookType bookType);
}
