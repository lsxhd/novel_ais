package com.only.novel.serviceimpl;

import com.only.novel.entity.BookType;
import com.only.novel.mapper.BookTypeMapper;
import com.only.novel.service.BookTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookTypeServiceImpl implements BookTypeService {
    @Resource
    private BookTypeMapper bookTypeMapper;

    @Override
    public List<BookType> getBookTypeList() {
        return bookTypeMapper.getBookTypeList();
    }

    @Override
    public int addBookType(BookType bookType) {
        return bookTypeMapper.addBookType(bookType);
    }

    @Override
    public int updateBookType(BookType bookType) {
        return bookTypeMapper.updateBookType(bookType);
    }

    @Override
    public int deleteBookType(BookType bookType) {
        return bookTypeMapper.deleteBookType(bookType.getId());
    }
}
