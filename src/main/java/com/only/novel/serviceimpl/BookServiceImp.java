package com.only.novel.serviceimpl;

import com.only.novel.common.Chapter;
import com.only.novel.entity.Books;
import com.only.novel.mapper.BookMapper;
import com.only.novel.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther:lsxh
 * @Date:2019/4/21 20:36
 * @Description:
 */
@Service
public class BookServiceImp implements BookService {
    @Resource
    private BookMapper bookMapper;

    private Chapter chapter = new Chapter();

    @Override
    public List<Books> getAllBooks() {
        return bookMapper.getAllBooks();
    }

    @Override
    public List<Books> selectBooksByType(int id) {
        return bookMapper.selectBooksByType(id);
    }

    @Override
    public Map<String,Object> getBookByID(int bookId) {
        Map<String,Object> map = new HashMap<>();
        Books book = bookMapper.getBookByID(bookId);
        int i=chapter.getChapterNumber(book.getBook_source());
        map.put("book",book);
        map.put("number",i);
        return map;
    }

    @Override
    public String getChapterByID(int bookId, int chapterId) {
        Map<String,Object> map = new HashMap<>();
        Books book = bookMapper.getBookByID(bookId);
        //设置章节的路径
        String path = book.getBook_source().concat("\\"+chapterId+".txt");
        String content = chapter.getChapter(path);
        return content;
    }
}
