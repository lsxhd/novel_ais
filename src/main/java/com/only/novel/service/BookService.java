package com.only.novel.service;

import com.only.novel.entity.Books;

import java.util.List;
import java.util.Map;

/**
 * @Auther:lsxh
 * @Date:2019/4/21 20:35
 * @Description:
 */
public interface BookService {
    public List<Books> getAllBooks();
    public List<Books> selectBooksByType(int id);
    public Map<String,Object> getBookByID(int bookId);
    public String getChapterByID(int bookId,int chapterId);
}
