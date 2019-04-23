package com.only.novel.serviceimpl;

import com.only.novel.entity.BookShelf;
import com.only.novel.mapper.BookShelfMapper;
import com.only.novel.service.BookShelfService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class BookShelfServiceImpl implements BookShelfService {
    @Resource
    private BookShelfMapper bookShelfMapper;

    @Override
    public List<BookShelf> getBookShelfList() {
        return bookShelfMapper.getBookShelfList();
    }

    @Override
    public int addBookShelf(BookShelf bookShelf) {
        return bookShelfMapper.addBookShelf(bookShelf);
    }

    @Override
    public int updateBookShelf(BookShelf bookShelf) {
        return bookShelfMapper.updateBookShelf(bookShelf);
    }

    @Override
    public int deleteBookShelf(BookShelf bookShelf) {
        return bookShelfMapper.deleteBookShelf(bookShelf.getId());
    }
}
