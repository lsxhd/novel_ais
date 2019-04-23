package com.only.novel.mapper;

import com.only.novel.entity.BookShelf;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BookShelfMapper {
    @Select("select * from BookShelf ")
    public List<BookShelf> getBookShelfList();

    @Insert("insert into BookShelf (user_id,book_id) value (#{user_id},#{book_id} )")
    public int addBookShelf(BookShelf bookShelf);

    @Delete("delete from BookShelf where id= #{id}")
    public int deleteBookShelf(int id);

    @Update("update BookShelf set name=#{name} where id=#{id}")
    public int updateBookShelf(BookShelf bookShelf);
}
